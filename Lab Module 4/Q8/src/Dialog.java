
import javax.swing.*;

class Dialog {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showInputDialog(null);
        JOptionPane.showMessageDialog(f, "Welcome " + name);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}