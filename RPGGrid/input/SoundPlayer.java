package RPGGrid.input;

import javax.sound.sampled.*;
import java.io.*;

public class SoundPlayer
{
    private static Clip clip;
    public static void play(String filename)
    {
        filename = filename + ".wav";
        try
        {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File(filename)));
            clip.start();
        }
        catch (Exception exc)
        {
            exc.printStackTrace(System.out);
        }
    }
    
    public static void pause()
    {
        clip.stop();
    }
}