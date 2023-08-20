import java.awt.*;
import java.util.*;
import javax.swing.*;

class Dialog_box {
    JLabel l1,l2,l3;
    JTextField tf1,tf2,tf3;

    public Dialog_box(){
        initGui();
    }
    public void initGui(){
        Scanner in = new Scanner(System.in);

        JFrame f = new JFrame("Dialog Box");
        JButton b = new JButton("Click me");
        JOptionPane.showInputDialog("Welcome to PDEU");

        l1 = new JLabel("Enter Message");
        tf1 = new JTextField(10);


//        System.out.println("Enter Roll No.: ");
//        String roll = in.nextLine();


//        tf1.setText(roll);


        Container c = f.getContentPane();
        c.setLayout(new FlowLayout());

        c.add(l1);
        c.add(tf1);


        f.setSize(300,300);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }



    public static void main(String[] args) {
        System.out.println("Hello world!");
        Dialog_box s1 = new Dialog_box();

    }
}