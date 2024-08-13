package VideoPlayer;

import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

import javax.swing.*;
import java.awt.*;

public class vlcTest {
    public static void main(String[] args) {
        System.setProperty("jna.library.path", "/Users/sammarsaini/Desktop/java_oops/native-libs");
        System.setProperty("vlcj.debug", "true");
        JFrame frame = new JFrame("VLCJ Test");
        EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();
        frame.setLayout(new BorderLayout());
        frame.add(mediaPlayerComponent, BorderLayout.CENTER);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        mediaPlayerComponent.mediaPlayer().media().start("/Users/sammarsaini/Desktop/MasterFolder/playlist4/ep3.mp4");
    }
}
