package swingANDawt;

//import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class swingClass {
    public static void main(String[] args) {
        awt obj = new awt();

    }
}

class awt extends JFrame{
    public awt(){
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        JTextField t1 = new JTextField(5);
        JTextField t2 = new JTextField(5);

        JButton b1 = new JButton("+");

        JLabel l1 = new JLabel("Output");

        add(t1);
        add(t2);
        add(b1);
        add(l1);

        ActionListener al = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String s1 = t1.getText();
                String s2 = t2.getText();

                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);

                Integer c = a + b;

                l1.setText(c.toString());

            }
        };
        b1.addActionListener(al);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
