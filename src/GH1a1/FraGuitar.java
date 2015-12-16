//George Saudan & David Weiler
package GH1a1;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class FraGuitar extends JFrame {

    public FraGuitar() {
        PanButton panButton = new PanButton();
        PanGuitar panGuitar = new PanGuitar(panButton);
        setLayout(new BorderLayout());
        add(panButton, BorderLayout.NORTH);
        add(panGuitar, BorderLayout.CENTER);
        setTitle("Rip-Off Guitar Hero");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        setSize(xSize, ySize);
        this.setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}