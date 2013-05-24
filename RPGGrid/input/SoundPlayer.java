/*
 * This code is based off examples given on docs.oracle.com.
 */

package RPGGrid.input;

import javax.sound.sampled.*;
import java.io.*;

/**
 * A <code>SoundPlayer<code> manages the sound for a RPGWorld.
 * @author Sean MacLane with the help of Oracle
 */
public class SoundPlayer
{
    private Clip clip;
    private File f;

    /**
     * Constructs a SoundPlayer with a given file.
     * @param file The .wav to play audio from
     */
    public SoundPlayer(File file)
    {
        f = file;
    }

    /**
     * Changes the file which the SoundPlayer will play from.
     * @param file the new .wav file
     */
    public void setFile(File file)
    {
        f = file;
    }

    /**
     * Plays a .wav file.
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