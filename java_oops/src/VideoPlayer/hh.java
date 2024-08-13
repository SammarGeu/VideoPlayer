package VideoPlayer;

import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

import javax.swing.*;
import java.awt.*;

public class hh{
    public static void main(String[] args) {
        // Set the correct path for native libraries
        System.setProperty("jna.library.path", "/Users/sammarsaini/Desktop/java_oops/native-libs");

        // Initialize VLCJ component
        JFrame frame = new JFrame("VLCJ Test");
        EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        frame.setLayout(new BorderLayout());
        frame.add(mediaPlayerComponent, BorderLayout.CENTER);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Start playing a test video
        mediaPlayerComponent.mediaPlayer().media().start("Users/sammarsaini/Desktop/MasterFolder/playlist4/ep3.mp4");
    }
}
