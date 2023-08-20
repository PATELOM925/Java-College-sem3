import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame f = new JFrame("Answer 11 - GROUP LAYOUT");
        Container c = f.getContentPane();
        GroupLayout g = new GroupLayout(c);
        c.setLayout(g);

        JLabel l = new JLabel("CLICK --> ");
        JButton b = new JButton("I AM BUTTON ");
        b.setBounds(40,40,100,30);
        g.setHorizontalGroup(
                g.createSequentialGroup()
                        .addComponent(l)
                        .addGap(25, 40, 100)
                        .addComponent(b));
        g.setVerticalGroup(
                g.createParallelGroup()
                        .addComponent(l)
                        .addGap(25, 40, 100)
                        .addComponent(b));
        f.pack();
        f.setSize(300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
