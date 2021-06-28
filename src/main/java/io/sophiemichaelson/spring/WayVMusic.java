package io.sophiemichaelson.spring;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class WayVMusic implements Music {

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }


    @Override
    public void playSong() {
        try {
            File soundFile = new File("C:\\Users\\User\\Desktop\\MusicPlayer\\WayV Love Talk.wav");

            AudioInputStream ais = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(ais);
            clip.setFramePosition(0);
            clip.start();
            Thread.sleep(clip.getMicrosecondLength()/1000);
            clip.stop();
            clip.close();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException exc) {
            exc.printStackTrace();
        } catch (InterruptedException exc) {}
    }



}
