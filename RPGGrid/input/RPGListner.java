package RPGGrid.input;

import RPGGrid.world.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * A <code>RPGListner<code> manages the user input for a RPGWorld.
 */
public class RPGListner
{
    RPGWorld world;
    
    /**
     * Constructs a RPGListner that manages player input and hotkeys
     * in a given world.
     * @param the world for the KeyListners to be added to.
     */
    public RPGListner(RPGWorld w)
    {
        world = w;
        world.getJFrame().addKeyListener(new KeyAdapter() 
            {
                public void keyPressed(KeyEvent arg0)
                {
                    boolean[] k = new boolean[KeyEvent.KEY_TYPED];
                    k[arg0.getKeyCode()] = true;

                    if(k[KeyEvent.VK_W])
                    {
                        world.getGrid().getThePlayer().up();
                    }
                    if(k[KeyEvent.VK_S])
                    {
                        world.getGrid().getThePlayer().down();
                    }
                    if(k[KeyEvent.VK_A])
                    {
                        world.getGrid().getThePlayer().left();
                    }
                    if(k[KeyEvent.VK_D])
                    {
                        world.getGrid().getThePlayer().right();
                    }
                    if(k[KeyEvent.VK_E])
                    {
                        System.out.println("Game menu not yet implemented.");
                    }
                }
            });
    }
}