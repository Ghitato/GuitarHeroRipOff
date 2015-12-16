//George Saudan & David Weiler
package Scratches;

import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class Sound {

    public static void main(String[] args) throws Exception {
        //FraGuitar fraGuitar = new FraGuitar();
        String Pump = "H:\\NetBeansProjects\\Pump.wav";
        InputStream in = new FileInputStream("Pump.wav");
        AudioStream audioStream = new AudioStream(in);
        AudioPlayer.player.start(audioStream);
    }
}