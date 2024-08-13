package VideoPlayer;

import uk.co.caprica.vlcj.player.component.EmbeddedMediaListPlayerComponent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo{
    public static void main(String[] args) {
        EmbeddedMediaListPlayerComponent component = new EmbeddedMediaListPlayerComponent();
        JFrame f  = new JFrame();
        f.setContentPane(component);
        f.setBounds(new Rectangle(200,200,800,600));
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                component.release();
                System.exit(0);
            }
        });
        f.setVisible(true);
      component.mediaPlayer().media().play("/Users/sammarsaini/Desktop/MasterFolder/playlist4/ep1.mp4",":avcodec-hw=none");
        // component.mediaPlayer().videoSurface().attachVideoSurface();

    }

}