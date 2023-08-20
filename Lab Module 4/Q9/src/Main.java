import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

    JButton b1 = new JButton("JAVA");
        b1.setPreferredSize(new Dimension(100,40));
        b1.setBounds(200,100,300,80);
        JButton b2 = new JButton("C++");
        b2.setPreferredSize(new Dimension(100,40));
        b2.setBounds(200,150,300,80);

        JPanel p1 = new JPanel(new FlowLayout());
        JPanel p2 = new JPanel(new FlowLayout());
        p1.add(b1);
        p2.add(b2);


        JPanel grid = new JPanel(new GridLayout(12,20));

    JCheckBox c1 = new JCheckBox("J",true);
    JCheckBox c2 = new JCheckBox("A",true);
    JCheckBox c3 = new JCheckBox("V",true);
    JCheckBox c4 = new JCheckBox("A",true);

    JCheckBox c11 = new JCheckBox("C",false);
    JCheckBox c12 = new JCheckBox("+",false);
    JCheckBox c13 = new JCheckBox("+",false);


        grid.add(c1);
        grid.add(c2);
        grid.add(c3);
        grid.add(c4);
        grid.add(p1);
        grid.add(c11);
        grid.add(c12);
        grid.add(c13);
        grid.add(p2);



    BorderLayout l1 = new BorderLayout();
    JPanel bl = new JPanel(l1);
    bl.add(grid,l1.WEST);
    bl.setBounds(100,100,150,50);


    JFrame f1 = new JFrame();
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   f1.add(bl);
   f1.setSize(600,400);
    f1.setVisible(true);

    }
}