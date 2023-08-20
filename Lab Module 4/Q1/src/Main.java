import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.net.ssl.HandshakeCompletedEvent;
import javax.swing.*;

public class Main extends Frame implements WindowListener {

   Main(){
       addWindowListener(this);
       setTitle("Window Handling events");
       setSize (300, 100);
       setLayout (null);
       setVisible (true);
       setBackground(Color.BLUE);
       setName("Hello");
   }

    public void windowActivated (WindowEvent arg0) {
        System.out.println("Windows Activating");
    }
    public void windowClosed (WindowEvent arg0) {
        System.out.println("Windows Closed");
    }
    public void windowClosing (WindowEvent arg0) {
        System.out.println("Windows Closing");
        dispose();
    }
    public void windowDeactivated (WindowEvent arg0) {
        System.out.println("Windows Deactivating");
    }
    public void windowDeiconified (WindowEvent arg0) {
        System.out.println("Windows Deinconified");
    }
    public void windowIconified(WindowEvent arg0) {
        System.out.println("Windows Iconified");
    }
    public void windowOpened(WindowEvent arg0) {
        System.out.println("Windows Opened");
    }


    public static void main(String[] args) {
        new Main();
    }

}
