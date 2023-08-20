import javax.swing.*;
import java.awt.*;
import java.util.*;

public class CheckBoxExample {

        CheckBoxExample(){
            JFrame f = new JFrame("Check Box Example");
            JCheckBox cb1 = new JCheckBox("C++",false);
            cb1.setBounds(100,50,100,50);
            JCheckBox cb2 = new JCheckBox("Java",false);
            cb2.setBounds(200,50,100,50);
            JButton b1 = new JButton("Calculate");
            f.add(cb1);
            f.add(cb2);
            f.add(b1);
            b1.setBounds(300,50,100,60);
            f.setSize(500,400);
            f.setLayout(null);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

           // OR

//            JFrame f = new JFrame("Check Box Example");
//            Container c = f.getContentPane();
//            JCheckBox cb1 = new JCheckBox("C++",false);
//            cb1.setBounds(100,200,100,50);
//            JCheckBox cb2 = new JCheckBox("Java",false);
//            cb2.setBounds(200,200,100,50);
//            JButton b1 = new JButton("Calculate");
//            c.add(cb1);
//            c.add(cb2);
//            c.add(b1);
//            c.setLayout(new FlowLayout());
//            f.setSize(500,400);
//            f.setVisible(true);
//            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

    public static void main(String[] args) {
        new CheckBoxExample();
    }

}