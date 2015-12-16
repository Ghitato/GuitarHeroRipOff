//George Saudan & David Weiler
package Scratches;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

public class ProgressBar extends JFrame {

    private JFrame f;
    private JPanel p;
    private JButton b1;
    private JLabel lab;
    private JProgressBar prog;

    public ProgressBar() {
        gui();
    }

    public void gui() {
        f = new JFrame("Well");
        f.setVisible(true);
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel();
        p.setBackground(Color.YELLOW);

        b1 = new JButton("Scratch");
        lab = new JLabel("This is a test Scratch");
        
        prog = new JProgressBar();
        
        p.add(b1);
        p.add(lab);
        p.add(prog);

        f.add(p);
    }

    public static void main(String[] args) throws Exception {
        new ProgressBar();
    }
}