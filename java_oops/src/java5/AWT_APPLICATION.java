package java5;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
//import java.util.List;

public class AWT_APPLICATION {
    public static void main(String[] args) {
        //frame
        Frame frame=new Frame(" AWT APPLICATION");

        //label,buttons
        //label
        Label label=new Label("Name:");
        label.setBounds(50,50,50,20);//position -x,y,width ,height

        //textfield
        TextField text=new TextField();
        text.setBounds(110,50,150,20);

        //button
        Button btn=new Button("Submit");
        btn.setBounds(110,120,100,20);

        //checkbox
        Checkbox chk3=new Checkbox("I agree to terms and conditions");
        chk3.setBounds(110,120,100,20);

        //radio buttons
        CheckboxGroup chk_group=new CheckboxGroup();
        Checkbox radio1=new Checkbox("Option1",chk_group,false);
        Checkbox radio2=new Checkbox("Option2",chk_group,false);
        radio1.setBounds(110,150,100,20);
        radio2.setBounds(220,150,100,20);

        //list
        List lst=new List();
        lst.setBounds(110,180,120,80);
        lst.add("Laptop");
        lst.add("Mouse");
        lst.add("SmartPhone");

        //scrollbar
        Scrollbar sb=new Scrollbar();
        sb.setBounds(250,180,20,80);

        frame.add(label);
        frame.add(text);
        frame.add(btn);

        frame.add(radio1);
        frame.add(radio2);
        frame.add(lst);
        frame.add(sb);
        frame.add(chk3);

        frame.setSize(400,400);
        //window listener-interface window events
        frame.addWindowListener(new WindowAdapter() {
            //windowAdapter
            public void windowClosing(WindowEvent e){
                frame.dispose();
            }
        });
        frame.setVisible(true);
    }
}