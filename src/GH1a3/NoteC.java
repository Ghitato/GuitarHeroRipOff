//George Saudan & David Weiler
package GH1a3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;

public class NoteC {

    Dimension screenSize;
    int nHeight = 20, nWidth = 100;
    int nWidthR = 35, nLengthR = 300;
    int nX, nY;

    NoteC(/*int _nHeight, int _nWidth*/) {
        /*nHeight = _nHeight;
        nWidth = _nWidth;*/
        nX = (int) (Math.random() * (nWidth - nLengthR));
        nY = (nHeight / 5) * 4;
    }

    public void draw(Graphics2D g2D) {
        g2D.fillRect(nX, nY, nLengthR, nWidthR);
    }

    public void update() {
        nY++;
        if (nY == nHeight) {
            nY = 0;
        }
    }
}