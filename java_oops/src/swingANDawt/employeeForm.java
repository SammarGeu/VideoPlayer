package swingANDawt;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class employeeForm {
    public static void main(String[] args) {
  Form obj = new Form();
    }
}

class Form extends JFrame {

 Form(){
     Scanner scn = new Scanner(System.in);
     System.out.println("enter the number of employees");
     int size = scn.nextInt();

     Integer []empId = new Integer[size];

     System.out.println("enter employee id");
     for (int i = 0; i < empId.length; i++) {
         empId[i]= scn.nextInt();
     }




    setVisible(true);
     setSize(400,400);
     setLayout(new FlowLayout());

     JLabel l1 = new JLabel("enter employee id");
     add(l1);
     JTextField t1 = new JTextField(5);
      add(t1);

      JList<Integer> jl1 = new JList<>(empId);
      add(jl1);
      JButton b1 = new JButton("Submit");
      add(b1);
      JLabel l2  = new JLabel("id Found ? ");
      add(l2);
     ActionListener a1 = new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            int [] empid = jl1.getSelectedIndices();
             int x = Integer.parseInt(t1.getText());
             boolean flag = false;
             for(int i=0;i<jl1.getModel().getSize();i++) {
                 int selectedIndex = empid[i];
                 int selectedEmpId = empId[selectedIndex];

                 if (selectedEmpId == x) {
                     l2.setText("Employee id found");
                     flag = true;
                     break;
                 }
             }
             if(!flag) {
                 l2.setText("Employee id not found");
             }
         }
     };
   b1.addActionListener(a1);

     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}
