package VideoPlayer;

import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class pokemon {

    private final JFrame frame;
    private final EmbeddedMediaPlayerComponent mediaPlayerComponent;

 //   private  final MediaPlayerFactory mediaPlayerFactory;
    private final List<File> playlist;
    private int currentVideoIndex = 0;

    private final JSlider playbackSlider;
    private Timer sliderUpdateTimer;

    private JButton savePlaylistButton;
    private JLabel timeLabelStart;
    private JLabel timeLabelEnd;

    private static final String MASTER_FOLDER_PATH = System.getProperty("user.home") + "/Desktop/MasterFolder";

    public pokemon() {
        frame = new JFrame("Java Video Player");
        mediaPlayerComponent = new EmbeddedMediaPlayerComponent();

        // Ensure VLCJ can find the native libraries
        String vlcLibPath = "/Applications/VLC.app/Contents/MacOS"; // Adjust if necessary
        System.setProperty("jna.library.path", vlcLibPath);

        playlist = new ArrayList<>();

        // Create the master folder if it doesn't exist
        File masterFolder = new File(MASTER_FOLDER_PATH);
        if (!masterFolder.exists()) {
            masterFolder.mkdirs();
        }

        // Setup frame
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        // Video Display
        frame.add(mediaPlayerComponent, BorderLayout.CENTER);

        // Controls
        JPanel controls = new JPanel();
        JButton playButton = new JButton("Play");
        JButton pauseButton = new JButton("Pause");
        JButton prevButton = new JButton("Previous");
        JButton nextButton = new JButton("Next");
        JButton createPlaylistButton = new JButton("Create Playlist");
        savePlaylistButton = new JButton("Save Playlist");
        savePlaylistButton.setEnabled(false); // Initially disabled
        JButton loadPlaylistButton = new JButton("Load Playlist");
        JButton volumeUpButton = new JButton("Volume Up");
        JButton volumeDownButton = new JButton("Volume Down");

        playbackSlider = new JSlider();
        playbackSlider.setValue(0);
        playbackSlider.setEnabled(false);

        timeLabelStart = new JLabel("00:00");
        timeLabelEnd = new JLabel("00:00");

        JPanel timePanel = new JPanel();
        timePanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 5, 0, 5); // Adjust insets as needed

        gbc.gridx = 0;
        gbc.weightx = 0.0;
        timePanel.add(timeLabelStart, gbc);

        gbc.gridx = 1;
        gbc.weightx = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        timePanel.add(playbackSlider, gbc);

        gbc.gridx = 2;
        gbc.weightx = 0.0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        timePanel.add(timeLabelEnd, gbc);

        controls.add(prevButton);
        controls.add(playButton);
        controls.add(pauseButton);
        controls.add(nextButton);
        controls.add(createPlaylistButton);
        controls.add(savePlaylistButton);
        controls.add(loadPlaylistButton);
        controls.add(volumeDownButton);
        controls.add(volumeUpButton);
        controls.add(timePanel);

        frame.add(controls, BorderLayout.SOUTH);

        // Action Listeners
        playButton.addActionListener(e -> playCurrentVideo());
        pauseButton.addActionListener(e -> mediaPlayerComponent.mediaPlayer().controls().pause());
        prevButton.addActionListener(e -> playPreviousVideo());
        nextButton.addActionListener(e -> playNextVideo());
        createPlaylistButton.addActionListener(e -> openCreatePlaylistDialog());
        savePlaylistButton.addActionListener(e -> savePlaylist());
        loadPlaylistButton.addActionListener(e -> loadPlaylist());
        volumeUpButton.addActionListener(e -> adjustVolume(0.1f)); // Increase volume by 10%
        volumeDownButton.addActionListener(e -> adjustVolume(-0.1f));
        playbackSlider.addChangeListener(e -> {
            if (playbackSlider.getValueIsAdjusting()) {
                seekToPosition();
            }
        });

        // Timer to update the slider position
        sliderUpdateTimer = new Timer(1000, e -> updateSlider());
        sliderUpdateTimer.start();

        // Show frame
        frame.setVisible(true);
    }

    private void playCurrentVideo() {
        if (!playlist.isEmpty()) {
            mediaPlayerComponent.mediaPlayer().media().start(playlist.get(currentVideoIndex).getAbsolutePath());
            playbackSlider.setEnabled(true);
            updateSlider(); // Update the slider and time labels when starting playback
        }
    }

    private void playPreviousVideo() {
        if (currentVideoIndex > 0) {
            currentVideoIndex--;
            playCurrentVideo();
        }
    }

    private void playNextVideo() {
        if (currentVideoIndex < playlist.size() - 1) {
            currentVideoIndex++;
            playCurrentVideo();
        }
    }

    private void seekToPosition() {
        float position = playbackSlider.getValue() / 100.0f;
        mediaPlayerComponent.mediaPlayer().controls().setPosition(position);
    }

    private void updateSlider() {
        if (mediaPlayerComponent.mediaPlayer().media().info() != null) {
            float position = mediaPlayerComponent.mediaPlayer().status().position();
            long length = mediaPlayerComponent.mediaPlayer().media().info().duration();

            playbackSlider.setValue((int) (position * 100));
            timeLabelStart.setText(formatTime((long) (position * length)));
            timeLabelEnd.setText(formatTime(length));
        } else {
            // Handle the case when media is not loaded
            timeLabelStart.setText("00:00");
            timeLabelEnd.setText("00:00");
        }
    }

    private String formatTime(long milliseconds) {
        int totalSeconds = (int) (milliseconds / 1000);
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }

    private void openCreatePlaylistDialog() {
        playlist.clear(); // Clear the existing playlist

        JDialog dialog = new JDialog(frame, "Create Playlist", true);
        dialog.setSize(400, 400);
        dialog.setResizable(false);
        dialog.setLocationRelativeTo(frame);
        dialog.setLayout(new BorderLayout());

        JPanel songContainer = new JPanel();
        songContainer.setLayout(new BoxLayout(songContainer, BoxLayout.Y_AXIS));
        JScrollPane scrollPane = new JScrollPane(songContainer);
        dialog.add(scrollPane, BorderLayout.CENTER);

        JButton addVideoButton = new JButton("Add Video");
        JButton doneButton = new JButton("Done");

        addVideoButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileFilter(new FileNameExtensionFilter("Video Files", "mp4", "avi", "mkv"));
            fileChooser.setMultiSelectionEnabled(true);

            if (fileChooser.showOpenDialog(dialog) == JFileChooser.APPROVE_OPTION) {
                File[] selectedFiles = fileChooser.getSelectedFiles();
                for (File file : selectedFiles) {
                    playlist.add(file);
                    JLabel filePathLabel = new JLabel(file.getAbsolutePath());
                    songContainer.add(filePathLabel);
                }
                dialog.revalidate();
            }
        });

        doneButton.addActionListener(e -> {
            if (!playlist.isEmpty()) {
                savePlaylistButton.setEnabled(true); // Enable Save Playlist button
            }
            dialog.dispose();
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addVideoButton);
        buttonPanel.add(doneButton);

        dialog.add(buttonPanel, BorderLayout.SOUTH);
        dialog.setVisible(true);
    }

    private void savePlaylist() {
        if (playlist.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "No playlist to save!");
            return;
        }

        // Ask for playlist name
        String playlistName = JOptionPane.showInputDialog(frame, "Enter Playlist Name:");

        if (playlistName != null && !playlistName.trim().isEmpty()) {
            File playlistDir = new File(MASTER_FOLDER_PATH, playlistName);

            if (!playlistDir.exists()) {
                playlistDir.mkdirs();
            }

            // Copy the selected videos to the new playlist directory
            for (File video : playlist) {
                try {
                    Files.copy(video.toPath(), Path.of(playlistDir.getAbsolutePath(), video.getName()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            JOptionPane.showMessageDialog(frame, "Playlist saved successfully!");
            savePlaylistButton.setEnabled(false); // Disable Save Playlist button after saving
        }
    }

    private void adjustVolume(float delta) {
        float currentVolume = mediaPlayerComponent.mediaPlayer().audio().volume() / 100.0f;
        float newVolume = Math.max(0.0f, Math.min(1.0f, currentVolume + delta));
        mediaPlayerComponent.mediaPlayer().audio().setVolume((int) (newVolume * 100));
    }

    private void loadPlaylist() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Directories", "directory"));
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        if (fileChooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
            File playlistDir = fileChooser.getSelectedFile();
            File[] files = playlistDir.listFiles((dir, name) -> name.toLowerCase().endsWith(".mp4")
                    || name.toLowerCase().endsWith(".avi")
                    || name.toLowerCase().endsWith(".mkv"));

            if (files != null) {
                playlist.clear();
                for (File file : files) {
                    playlist.add(file);
                }
                currentVideoIndex = 0; // Reset to start of playlist
                playCurrentVideo(); // Start playing the first video
                savePlaylistButton.setEnabled(false); // Disable Save Playlist button as playlist is loaded
            } else {
                JOptionPane.showMessageDialog(frame, "No videos found in the selected directory!");
            }
        }
    }
    public static void main(String[] args) {

        SwingUtilities.invokeLater(pokemon::new);
    }
}
