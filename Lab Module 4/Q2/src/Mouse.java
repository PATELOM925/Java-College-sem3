import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class Mouse extends Frame implements MouseInputListener {

    Mouse() {
        addMouseListener(this);
        setTitle("Mouse Handling events");
        setSize(200, 100);
        setLayout(null);
        setVisible(true);
        setBackground(Color.RED);
        setName("Hello");
    }

    public void mouseClicked(java.awt.event.MouseEvent e) {
        System.out.println("Mouse clicked");
    }
    public void mousePressed(java.awt.event.MouseEvent e) {
        System.out.println("Mouse pressed");
    }
    public void mouseReleased(java.awt.event.MouseEvent e) {
        System.out.println("Mouse released");
    }
    public void mouseEntered(java.awt.event.MouseEvent e) {
        System.out.println("Mouse entered");
    }
    public void mouseExited(java.awt.event.MouseEvent e) {
        System.out.println("Mouse exited");
    }
    public void mouseDragged(java.awt.event.MouseEvent e) {
        System.out.println("Mouse dragged");
    }
    public void mouseMoved(java.awt.event.MouseEvent e) {
        System.out.println("Mouse moved");
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        Mouse m = new Mouse();
    } }
