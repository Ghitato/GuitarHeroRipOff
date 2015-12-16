//George Saudan & David Weiler
package GH1a2;

import java.awt.BorderLayout;
//import java.awt.Dimension;
import javax.swing.JProgressBar;
import javax.swing.JPanel;

public class PanProgress extends JPanel {

    JProgressBar jprgbarHealth;

    PanProgress() {
        setLayout(new BorderLayout());
        jprgbarHealth = new JProgressBar();
        add(jprgbarHealth, BorderLayout.SOUTH);
    }
}
