import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame f = new JFrame("BUTTON EXAMPLE: ");
        //create button
        JButton b = new JButton("CLICK ME");
        //event handler
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f,"I am Button"); } });

        JPanel p = new JPanel( );
        p.add(b);
        f.setSize(250, 150);
        f.getContentPane( ).add(p,BorderLayout.NORTH);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

