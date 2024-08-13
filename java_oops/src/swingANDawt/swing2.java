package swingANDawt;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class swing2 {
    public static void main(String[] args) {
        group obj = new group();
    }
}

class group extends JFrame{

    group(){
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());

        JLabel l2 = new JLabel("Name");
        JTextField t1 = new JTextField(10);

        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("Female");

        JCheckBox c1 = new JCheckBox("likes Coffee");
        JCheckBox c2 = new JCheckBox("likes Tea");
         JTextArea a1 = new JTextArea(5,5);
         add(a1);
        add(l2);
        add(t1);

        add(r1);
        add(r2);

        add(c1);
        add(c2);

        JButton b1 = new JButton("Submit detail");
        add(b1);

        JLabel l1 = new JLabel("Greetings.");
        add(l1);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(c1);
        bg1.add(c2);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

        ActionListener al = new ActionListener() {
             @Override
            public void actionPerformed(ActionEvent e) {

                String name = t1.getText();

                if(r1.isSelected()) {
                    name = "Mr. " + name;
                }

                if(r2.isSelected()) {
                    name = "Ms. " + name;
                }

                if(c1.isSelected()) {
                    name = name + " likes coffee";
                }

                if(c2.isSelected()) {
                    name = name + ", likes tea.";
                }

                l1.setText(name);

            }
        };

        b1.addActionListener(al);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
