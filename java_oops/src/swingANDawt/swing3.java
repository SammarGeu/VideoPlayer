package swingANDawt;

import javax.swing.*;
import java.awt.*;

public class swing3 {
    public static void main(String[] args) {

        swing obj = new swing();
    }
}

class swing extends JFrame{
     swing(){
         setVisible(true);
         setSize(400,400);
         setLayout(new FlowLayout());

         String[] groceryItems = {"Bread", "Coffee", "Tea", "Butter", "Milk"};

         JList<String> jl = new JList<>(groceryItems);
         add(jl);

         JComboBox<String> jcb = new JComboBox<>(groceryItems);
        // add(jcb);

         String[] columns = {"Id", "Name", "Age"};
         String[][] data = {{"1","Amit Kumar", "29"},
                           {"2","Atul Kumar", "29"},
                            {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                 {"3","Anuj Kumar", "29"},
                               };

         JTable jt = new JTable(data, columns);
         add(jt);

         JScrollPane jsp = new JScrollPane(jt);
         add(jsp);
         JScrollBar jsb = new JScrollBar();
         add(jsb);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


     }
}
