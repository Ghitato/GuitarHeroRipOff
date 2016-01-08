//George Saudan & David Weiler
package GH1a3;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JProgressBar;

public class FraGuitar extends JFrame {

    public FraGuitar() {
        PanButton panButton = new PanButton();
        NoteA noteA = new NoteA();
        NoteB noteB = new NoteB();
        NoteC noteC = new NoteC();
        PanGuitar panGuitar = new PanGuitar(panButton, noteA, noteB, noteC);
        //PanGuitar panGuitar = new PanGuitar(JProgressBar);
        setLayout(new BorderLayout());
        add(panButton, BorderLayout.NORTH);
        add(panGuitar, BorderLayout.CENTER);
        //add(NoteA, BorderLayout.EAST);
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
