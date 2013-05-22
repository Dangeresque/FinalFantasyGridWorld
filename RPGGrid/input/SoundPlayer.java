package RPGGrid.input;

import javax.sound.sampled.*;
import java.io.*;

/**
 * A <code>SoundPlayer<code> manages the sound for a RPGWorld.
 */
public class SoundPlayer
{
    private Clip clip;
    private File f;
    
    public SoundPlayer(File file)
    {
        f = file;
    }
    
    public void setFile(File file)
    {
        f = file;
    }
    
    /**
     * Plays a .wav file.
     * @param filename is the name of a .wav file in the projects root directory
     */
    public void play()
    {
        try
        {
            clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(f));
            clip.start();
        }
        catch (Exception ex)
        {
            ex.printStackTrace(System.out);
        }
    }
    
    /**
     * Stops all sounds currently playing.  Sets f equal to null to avoid out of memeory errors.
     */
    public void pause()
    {
        clip.stop();
        f = null;
    }
}