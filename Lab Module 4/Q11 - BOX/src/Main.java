import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame f = new JFrame("Answer 11 - BOX LAYOUT");
        JPanel p = new JPanel();
        BoxLayout box = new BoxLayout(p,BoxLayout.PAGE_AXIS);
        p.setLayout(box);
        p.setBackground(Color.BLUE);
        p.setForeground(Color.WHITE);

        JButton b;
        for (int i=1;i<5;i++){
            b = new JButton("JAVA MODULE :" + i + " ✔");
            p.add(b); }
        f.add(p);
        f.pack();
        f.setSize(300,200);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}