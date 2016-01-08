//George Saudan & David Weiler
package GH1a3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanButton extends JPanel {

    public JButton btnUpdateLabel1;
    public JButton btnUpdateLabel2;
    public JButton btnUpdateLabel3;
  /*public JButton btnA;
    public JButton btnB;
    public JButton btnC;*/

    PanButton() {
        setLayout(new BorderLayout());
        btnUpdateLabel1 = new JButton("Easy");
        btnUpdateLabel1.setMaximumSize(new Dimension(100, 100));
        btnUpdateLabel1.setMinimumSize(new Dimension(100, 100));
        btnUpdateLabel2 = new JButton("Normal");
        btnUpdateLabel2.setMaximumSize(new Dimension(100, 100));
        btnUpdateLabel2.setMinimumSize(new Dimension(100, 100));
        btnUpdateLabel3 = new JButton("Hard");
        btnUpdateLabel3.setMaximumSize(new Dimension(100, 100));
        btnUpdateLabel3.setMinimumSize(new Dimension(100, 100));
        add(btnUpdateLabel1, BorderLayout.WEST);
        add(btnUpdateLabel2, BorderLayout.CENTER);
        add(btnUpdateLabel3, BorderLayout.EAST);
        /*btnUpdateLabel1 = new JButton("A");
        btnUpdateLabel1.setMaximumSize(new Dimension(100, 100));
        btnUpdateLabel1.setMinimumSize(new Dimension(100, 100));
        btnUpdateLabel2 = new JButton("B");
        btnUpdateLabel2.setMaximumSize(new Dimension(100, 100));
        btnUpdateLabel2.setMinimumSize(new Dimension(100, 100));
        btnUpdateLabel3 = new JButton("C");
        btnUpdateLabel3.setMaximumSize(new Dimension(100, 100));
        btnUpdateLabel3.setMinimumSize(new Dimension(100, 100));
        add(btnUpdateLabel1, BorderLayout.EAST);
        add(btnUpdateLabel2, BorderLayout.EAST);
        add(btnUpdateLabel3, BorderLayout.EAST);*/
    }
}
