
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4;
    JTextField t1, t2, t3, t4;
    JButton b1;
    String s1, s2, s3, s4;
    int id;

    Main() {
        l1 = new JLabel("ID");
        l2 = new JLabel("Model No: ");
        l3 = new JLabel("Price: ");
        l4 = new JLabel("Mobile Brand");
        t1 = new JTextField(30);
        t2 = new JTextField(30);
        t3 = new JTextField(30);
        t4 = new JTextField(30);
        b1 = new JButton("Search");
        b1.addActionListener(this);

        setLayout(new GridLayout(5, 2));
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b1);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        id = Integer.parseInt(t1.getText());
        try {
            File f = new File("Device.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] arr = line.split(",");
                if (id == Integer.parseInt(arr[0])) {
                    t2.setText(arr[1]);
                    t3.setText(arr[2]);
                    t4.setText(arr[3]);
                }
            }
        } catch (Exception e1) {
            System.out.println(e1);
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}