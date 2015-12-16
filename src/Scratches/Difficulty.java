//George Saudan & David Weiler
package Scratches;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;

public class Difficulty extends JFrame {

    private JFrame f;
    private JPanel p;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JLabel lab;

    public Difficulty() {
        gui();
    }

    public void gui() {
        f = new JFrame("Well");
        f.setVisible(true);
        f.setSize(600, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        p = new JPanel();
        p.setBackground(Color.YELLOW);

        b1 = new JButton("Easy");
        lab = new JLabel("This is a test Scratch");

        b2 = new JButton("Medium");
        lab = new JLabel("This is a Scratch");

        b3 = new JButton("Easy");
        lab = new JLabel("This is Scratch");

        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(lab);

        f.add(p);
    }

    public static void main(String[] args) throws Exception {
        new Difficulty();
    }
}
