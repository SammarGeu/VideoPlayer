package swingANDawt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
public class swing5 extends MouseMotionAdapter {

    JFrame f;
    public static void main(String[] args)
    {
        swing5 obj = new swing5();
    }

    swing5() {
       f= new JFrame("Mouse Motion Adapter");

        // Register frame with some listener
        f.addMouseMotionListener(this);

        f.setSize(300, 300);
        f.setLayout(null);
        f.setVisible(true);

//?
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    //this method is always called whenever we drag the mouse
    public void mouseDragged(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.RED);
        g.fillRect(e.getX(), e.getY(), 5, 5);
    }

}
