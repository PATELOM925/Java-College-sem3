import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class Student_infoDisplay {
    JLabel l1, l2, l3;
    JTextField tf1, tf2, tf3;

    ActionListener e = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Your Information has been submitted");
        }
    };

        public  Student_infoDisplay() {

            Scanner in = new Scanner(System.in);

            JFrame f = new JFrame("Student Info");
            JButton b = new JButton("Submit Info");
            b.setBackground(Color.black);
            b.setForeground(Color.red);
            l1 = new JLabel("Roll No.");
            l2 = new JLabel("Name");
            l3 = new JLabel("Branch");

            tf1 = new JTextField(20);
            tf2 = new JTextField(20);
            tf3 = new JTextField(20);

            System.out.println("Enter Roll No.: ");
            String roll = in.nextLine();
            System.out.println("Name : ");
            String name = in.nextLine();
            System.out.println("Branch : ");
            String branch = in.nextLine();

            tf1.setText(roll);
            tf2.setText(name);
            tf3.setText(branch);

//            Container c = f.getContentPane();
//            c.setLayout(new FlowLayout());
//
//            c.add(l1);
//            c.add(tf1);
//            c.add(l2);
//            c.add(tf2);
//            c.add(l3);
//            c.add(tf3);
            f.setLayout(new FlowLayout());
            f.add(l1);
            f.add(tf1);
            f.add(l2);
            f.add(tf2);
            f.add(l3);
            f.add(tf3);
            f.add(b);
            b.addActionListener(e);
            f.setSize(280, 300);
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        }


        public static void main(String[] args) {
            System.out.println("Hello world!");
            Student_infoDisplay s1 = new Student_infoDisplay();

        }
    }

