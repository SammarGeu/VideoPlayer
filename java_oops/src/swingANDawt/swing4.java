package swingANDawt;

import javax.swing.*;
import java.awt.*;

public class swing4 extends Canvas {

    public static void main(String []args) {

        swing4 obj = new swing4();

        JFrame jf = new JFrame();
        jf.add(obj);


        jf.setVisible(true);
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public void paint(Graphics g) {

        g.drawOval(120, 60, 30, 30);
        g.drawOval(290, 60, 30, 30);
        setForeground(Color.RED);
        g.fillOval(160, 60, 30, 30);
        g.fillOval(250, 60, 30, 30);

        g.drawArc(200, 60, 50, 50, 240, 60);
        g.drawRect(150, 40, 140, 90);

    }

}