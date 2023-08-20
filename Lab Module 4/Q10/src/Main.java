import javax.swing.*;
import java.util.*;
import java.awt.*;

class Main {
    public static void main(String[] args) {
        JFrame F1 = new JFrame("Exam-schedule");
        JPanel P1 = new JPanel();
        P1.setLayout(new GridLayout(4, 4));

        JButton java = new JButton("JAVA --> ");
        JButton Monday = new JButton("MONDAY");
        JButton Maths = new JButton("MATHS --> ");
        JButton Tuesday = new JButton("TUESDAY");
        JButton DECO = new JButton("DECO --> ");
        JButton Wednesday = new JButton("WEDNESDAY");
        JButton DSA = new JButton("DSA --> ");
        JButton Thursday = new JButton("THURSDAY");
        P1.add(java);
        P1.add(Monday);
        P1.add(Maths);
        P1.add(Tuesday);
        P1.add(DECO);
        P1.add(Wednesday);
        P1.add(DSA);
        P1.add(Thursday);

        JPanel J1 = new JPanel();
        J1.setLayout(new CardLayout(5, 3));
        J1.add("EXAMS", P1);
        F1.setContentPane(J1);
        F1.setSize(450, 450);
        F1.setVisible(true);
        F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}