//public class abc {
//    private void openCreatePlaylistDialog() {
//        playlist.clear(); // Clear the existing playlist
//
//        JDialog dialog = new JDialog(frame, "Create Playlist", true);
//        dialog.setSize(400, 400);
//        dialog.setResizable(false);
//        dialog.setLocationRelativeTo(frame);
//        dialog.setLayout(new BorderLayout());
//
//        JPanel songContainer = new JPanel();
//        songContainer.setLayout(new BoxLayout(songContainer, BoxLayout.Y_AXIS));
//        JScrollPane scrollPane = new JScrollPane(songContainer);
//        dialog.add(scrollPane, BorderLayout.CENTER);
//
//        JButton addVideoButton = new JButton("Add Video");
//        JButton doneButton = new JButton("Done");
//
//        addVideoButton.addActionListener(e -> {
//            JFileChooser fileChooser = new JFileChooser();
//            fileChooser.setFileFilter(new FileNameExtensionFilter("Video Files", "mp4", "avi", "mkv"));
//            fileChooser.setMultiSelectionEnabled(true);
//
//            if (fileChooser.showOpenDialog(dialog) == JFileChooser.APPROVE_OPTION) {
//                File[] selectedFiles = fileChooser.getSelectedFiles();
//                for (File file : selectedFiles) {
//                    playlist.add(file);
//                    JLabel filePathLabel = new JLabel(file.getAbsolutePath());
//                    songContainer.add(filePathLabel);
//                }
//                dialog.revalidate();
//            }
//        });
//
//        doneButton.addActionListener(e -> {
//            if (!playlist.isEmpty()) {
//                savePlaylistButton.setEnabled(true); // Enable Save Playlist button
//            }
//            dialog.dispose();
//        });
//
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.add(addVideoButton);
//        buttonPanel.add(doneButton);
//
//        dialog.add(buttonPanel, BorderLayout.SOUTH);
//        dialog.setVisible(true);
//    }
//
//    private void savePlaylist() {
//        if (playlist.isEmpty()) {
//            JOptionPane.showMessageDialog(frame, "No playlist to save!");
//            return;
//        }
//
//        // Ask for playlist name
//        String playlistName = JOptionPane.showInputDialog(frame, "Enter Playlist Name:");
//
//        if (playlistName != null && !playlistName.trim().isEmpty()) {
//            JFileChooser dirChooser = new JFileChooser();
//            dirChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
//
//            if (dirChooser.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION) {
//                File selectedDir = dirChooser.getSelectedFile();
//                File playlistDir = new File(selectedDir, playlistName);
//
//                if (!playlistDir.exists()) {
//                    playlistDir.mkdirs();
//                }
//
//                // Copy the selected videos to the new playlist directory
//                for (File video : playlist) {
//                    try {
//                        Files.copy(video.toPath(), Path.of(playlistDir.getAbsolutePath(), video.getName()));
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//                JOptionPane.showMessageDialog(frame, "Playlist saved successfully!");
//                savePlaylistButton.setEnabled(false); // Disable Save Playlist button after saving
//            }
//        }
//    }
//
//}
