//George Saudan & David Weiler
package GH1a2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class PanGuitar extends JPanel {

    JLabel lblOutput;
    //JLabel lblLine;
    JProgressBar jprgbarHealth;
    PanButton panButton;
    boolean isEasy = false;
    boolean isNormal = false;
    boolean isHard = false;

    PanGuitar(PanButton _panButton) {
        panButton = _panButton;
        //jprgbar = _jprgbar;
        setLayout(new BorderLayout());
        //int nHealth = 100;
        //int nScore = 0;
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

    class DiffHealth1 implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            setBackground(new Color(255, 255, 0));
        }
    }

    class DiffChan1 implements ActionListener {

        public void actionPerformed(ActionEvent event/*, boolean isEasy*/) {
            isEasy = true;
            setBackground(new Color(125, 100, 26));

            ImageIcon treb = new ImageIcon("trebleclef.png");
            treb.setImage(treb.getImage().getScaledInstance(100, 400, 0));
            JLabel picture = new JLabel(treb);
            picture.setBounds(100, 370, 100, 400);
            add(picture);

            ImageIcon line = new ImageIcon("liney.png");
            line.setImage(line.getImage().getScaledInstance(2000, 100, 0));
            JLabel picline = new JLabel(line);
            picline.setBounds(100, 370, 1500, 400);
            add(picline);

            String Slow = "Slow.wav";
            InputStream in = null;
            try {
                in = new FileInputStream("Slow.wav");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PanGuitar.class.getName()).log(Level.SEVERE, null, ex);
            }
            AudioStream audioStream = null;
            try {
                audioStream = new AudioStream(in);
            } catch (IOException ex) {
                Logger.getLogger(PanGuitar.class.getName()).log(Level.SEVERE, null, ex);
            }
            AudioPlayer.player.start(audioStream);
        }
    }

    class DiffChan2 implements ActionListener {

        public void actionPerformed(ActionEvent event/*, boolean isNormal*/) {
            isNormal = true;
            setBackground(Color.GRAY);

            ImageIcon treb = new ImageIcon("trebleclef.png");
            treb.setImage(treb.getImage().getScaledInstance(100, 400, 0));
            JLabel picture = new JLabel(treb);
            picture.setBounds(100, 370, 100, 400);
            add(picture);

            ImageIcon line = new ImageIcon("liney.png");
            line.setImage(line.getImage().getScaledInstance(2000, 100, 0));
            JLabel picline = new JLabel(line);
            picline.setBounds(100, 370, 1500, 400);
            add(picline);

            ImageIcon liney = new ImageIcon("liney.png");
            liney.setImage(liney.getImage().getScaledInstance(2000, 100, 0));
            JLabel picliney = new JLabel(liney);
            picliney.setBounds(100, 370, 1500, 200);
            add(picliney);

            String Pump = "Pump.wav";
            InputStream in = null;
            try {
                in = new FileInputStream("Pump.wav");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PanGuitar.class.getName()).log(Level.SEVERE, null, ex);
            }
            AudioStream audioStream = null;
            try {
                audioStream = new AudioStream(in);
            } catch (IOException ex) {
                Logger.getLogger(PanGuitar.class.getName()).log(Level.SEVERE, null, ex);
            }
            AudioPlayer.player.start(audioStream);
        }
    }

    class DiffChan3 implements ActionListener {

        public void actionPerformed(ActionEvent event/*, boolean isHard*/) {
            isHard = true;
            setBackground(Color.RED);

            ImageIcon treb = new ImageIcon("trebleclef.png");
            treb.setImage(treb.getImage().getScaledInstance(100, 400, 0));
            JLabel picture = new JLabel(treb);
            picture.setBounds(100, 370, 100, 400);
            add(picture);

            ImageIcon line = new ImageIcon("liney.png");
            line.setImage(line.getImage().getScaledInstance(2000, 100, 0));
            JLabel picline = new JLabel(line);
            picline.setBounds(100, 370, 1500, 400);
            add(picline);

            ImageIcon liney = new ImageIcon("liney.png");
            liney.setImage(liney.getImage().getScaledInstance(2000, 100, 0));
            JLabel picliney = new JLabel(liney);
            picliney.setBounds(100, 370, 1500, 200);
            add(picliney);

            ImageIcon liner = new ImageIcon("liney.png");
            liner.setImage(liner.getImage().getScaledInstance(2000, 100, 0));
            JLabel picliner = new JLabel(liner);
            picliner.setBounds(100, 370, 1500, 600);
            add(picliner);

            String Fuse = "Fusion.wav";
            InputStream in = null;
            try {
                in = new FileInputStream("Fusion.wav");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PanGuitar.class.getName()).log(Level.SEVERE, null, ex);
            }
            AudioStream audioStream = null;
            try {
                audioStream = new AudioStream(in);
            } catch (IOException ex) {
                Logger.getLogger(PanGuitar.class.getName()).log(Level.SEVERE, null, ex);
            }
            AudioPlayer.player.start(audioStream);
        }
    }
}