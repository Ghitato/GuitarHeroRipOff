//George Saudan & David Weiler
package GH1a2;

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
        //jprgbar = _jprgbar;
        setLayout(new BorderLayout());
        //int nHealth = 100;
        setBackground(Color.DARK_GRAY);
        jprgbarHealth = new JProgressBar();
        add(jprgbarHealth, BorderLayout.SOUTH);
        setFocusable(true);
        PanGuitar.DiffHealth1 diffHealth1 = new PanGuitar.DiffHealth1();
        PanGuitar.DiffChan1 diffChan1 = new PanGuitar.DiffChan1();
        PanGuitar.DiffChan2 diffChan2 = new PanGuitar.DiffChan2();
        PanGuitar.DiffChan3 diffChan3 = new PanGuitar.DiffChan3();
        //jprgbar.jprgbarHealth.addActionListener(diffHealth1);
        panButton.btnUpdateLabel1.addActionListener(diffChan1);
        panButton.btnUpdateLabel2.addActionListener(diffChan2);
        panButton.btnUpdateLabel3.addActionListener(diffChan3);
    }
/*        PanGuitar(JProgressBar _jprgbar) {
        jprgbar = _jprgbar;
        setLayout(new BorderLayout());
        setFocusable(true);
        PanGuitar.DiffHealth1 diffHealth1 = new PanGuitar.DiffHealth1();
        jprgbar.jprgbarHealth.addActionListener(diffHealth1);
    }*/
    
    class DiffHealth1 implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            setBackground(new Color(255, 255, 0));
        }
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
            setBackground(Color.RED);
        }
    }
}