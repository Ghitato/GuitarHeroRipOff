//George Saudan & David Weiler
package GH1a1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class PanGuitar extends JPanel {

    JLabel lblOutput;
    JProgressBar jprgbarHealth;
    PanButton panButton;

    PanGuitar(PanButton _panButton) {
        panButton = _panButton;
        setLayout(new BorderLayout());
        int nHealth = 100;
        setBackground(Color.DARK_GRAY);
        jprgbarHealth = new JProgressBar();
        add(jprgbarHealth, BorderLayout.SOUTH);
        setFocusable(true);
        DiffChan1 diffChan1 = new DiffChan1();
        DiffChan2 diffChan2 = new DiffChan2();
        DiffChan3 diffChan3 = new DiffChan3();
        panButton.btnUpdateLabel1.addActionListener(diffChan1);
        panButton.btnUpdateLabel2.addActionListener(diffChan2);
        panButton.btnUpdateLabel3.addActionListener(diffChan3);
    }

    class DiffChan1 implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            setBackground(new Color(125, 100, 26));
        }
    }

    class DiffChan2 implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            setBackground(Color.GRAY);
        }
    }

    class DiffChan3 implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            setBackground(new Color(255, 255, 0));
        }
    }
}