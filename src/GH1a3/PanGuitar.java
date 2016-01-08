//George Saudan & David Weiler
package GH1a3;

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
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PanGuitar extends JPanel {
    //JLabel lblLine;
    /*boolean isEasy = false;
     boolean isNormal = false;
     boolean isHard = false;*/

    JLabel lblOutput;
    JProgressBar jprgbarHealth;
    PanButton panButton;
    NoteA noteA;
    NoteB noteB;
    NoteC noteC;
    Dimension screenSize;
    int nHeight, nWidth;
    int nWidthR = 35, nLengthR = 300;
    public static int Adder = 10;
    Timer timer;

    PanGuitar(PanButton _panButton, NoteA _noteA, NoteB _noteB, NoteC _noteC) {
        //jprgbar = _jprgbar;
        //int nHealth = 100;
        //int nScore = 0;
        setLayout(new BorderLayout());
        panButton = _panButton;
        noteA = _noteA;
        setLayout(new BorderLayout());
        setBackground(Color.DARK_GRAY);
        jprgbarHealth = new JProgressBar();
        add(jprgbarHealth, BorderLayout.SOUTH);
        setFocusable(true);
        //PanGuitar.DiffHealth1 diffHealth1 = new PanGuitar.DiffHealth1();
        PanGuitar.DiffChan1 diffChan1 = new PanGuitar.DiffChan1(/*panButton, this*/);
        PanGuitar.DiffChan2 diffChan2 = new PanGuitar.DiffChan2(/*panButton, this*/);
        PanGuitar.DiffChan3 diffChan3 = new PanGuitar.DiffChan3(/*panButton, this*/);
        //jprgbar.jprgbarHealth.addActionListener(diffHealth1);
        panButton.btnUpdateLabel1.addActionListener(diffChan1);
        panButton.btnUpdateLabel2.addActionListener(diffChan2);
        panButton.btnUpdateLabel3.addActionListener(diffChan3);
    }
    /*PanGuitar(NoteA _noteA) {
     screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
     nHeight = (int) screenSize.getHeight();
     nWidth = (int) screenSize.getWidth();
     noteA = new NoteA(nHeight, nWidth);
     noteB = new NoteB(nHeight, nWidth);
     noteC = new NoteC(nHeight, nWidth);

     super.setFocusable(true);
     super.requestFocusInWindow();
     timer = new Timer(1, (ActionListener) this);
     timer.start();
     }*/
    /*class DiffHealth1 implements ActionListener {

     @Override
     public void actionPerformed(ActionEvent event) {
     setBackground(new Color(255, 255, 0));
     }
     }*/
    public void actionPerformed(ActionEvent e) {
     noteA.update();
     //noteB.update();
     //noteC.update();
     super.repaint();
     }

     @Override
     public void paintComponent(Graphics g) {
     g.fillRect(0, 0, nWidth, nHeight);
     g.setColor(Color.DARK_GRAY);
     noteA.draw((Graphics2D) g);
     //noteB.draw((Graphics2D) g);
     //noteC.draw((Graphics2D) g);
     //Get a rectangle to display with background color
     }

    class DiffChan1 implements ActionListener {

        public void actionPerformed(ActionEvent event/*, boolean isEasy*/) {
            //isEasy = true;
            setBackground(new Color(125, 100, 26));
            panButton.setVisible(false);
            int Score = 100;
            JLabel labelScore = new JLabel();
            labelScore.setText("100");
            labelScore.createImage(nWidth, nHeight);
            labelScore.setBounds(650, -50, 100, 500);
            labelScore.setFont(new Font("Arial", 0, 55));
            add(labelScore);
            setVisible(true);

            ImageIcon score = new ImageIcon("score.png");
            score.setImage(score.getImage().getScaledInstance(600, 100, 0));
            JLabel picscore = new JLabel(score);
            picscore.setBounds(0, 150, 600, 100);
            add(picscore);

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

        @Override
        public void actionPerformed(ActionEvent event/*, boolean isNormal*/) {
            //isNormal = true;
            setBackground(Color.GRAY);
            panButton.setVisible(false);
            int Score = 50;
            JLabel labelScore = new JLabel();
            labelScore.setText("50");
            labelScore.setBounds(650, -50, 1000, 500);
            labelScore.setFont(new Font("Arial", 0, 55));
            add(labelScore);
            setVisible(true);

            ImageIcon score = new ImageIcon("score.png");
            score.setImage(score.getImage().getScaledInstance(600, 100, 0));
            JLabel picscore = new JLabel(score);
            picscore.setBounds(0, 150, 600, 100);
            add(picscore);

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
        /*PanButton panButton;
         PanGuitar panGuitar;

         DiffChan3(PanButton _panButton, PanGuitar _panGuitar) {
         panButton = _panButton;
         panGuitar = _panGuitar;
         }*/

        @Override
        public void actionPerformed(ActionEvent event/*, boolean isHard*/) {
            //isHard = true;            
            //setBackground(Color.RED);

            /*ImageIcon score = new ImageIcon("Hardmode.png");
             score.setImage(score.getImage().getScaledInstance(600, 100, 0));
             JLabel picHard = new JLabel(score);
             picHard.setBounds(0, 150, 600, 100);
             add(picHard);*/

            panButton.setVisible(false);
            int Score = 10;
            JLabel labelScore = new JLabel();
            labelScore.setText("10");
            labelScore.setBounds(650, -50, 1000, 500);
            labelScore.setFont(new Font("Ariel", 0, 55));
            add(labelScore);
            setVisible(true);

            ImageIcon score = new ImageIcon("score.png");
            score.setImage(score.getImage().getScaledInstance(600, 100, 0));
            JLabel picscore = new JLabel(score);
            picscore.setBounds(0, 150, 600, 100);
            add(picscore);

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