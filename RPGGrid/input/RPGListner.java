/*
 * This code is based off an input tutorial from docs.oracle.com.
 */

package RPGGrid.input;

import RPGGrid.world.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * A <code>RPGListner<code> manages the user input for a RPGWorld.
 * @author Sean MacLane with the help of Oracle
 */
public class RPGListner
{
    RPGWorld world;

    /**
     * Constructs a RPGListner that manages player input and hotkeys
     * in a given world.
     * @param w The world for the KeyListners to be added to.
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
                        if(world.getBattle() == null)
                        {
                            world.getGrid().getThePlayer().up();
                        }
                    }
                    if(k[KeyEvent.VK_S])
                    {
                        if(world.getBattle() == null)
                        {
                            world.getGrid().getThePlayer().down();
                        }
                    }
                    if(k[KeyEvent.VK_A])
                    {
                        if(world.getBattle() == null)
                        {
                            world.getGrid().getThePlayer().left();
                        }
                    }
                    if(k[KeyEvent.VK_D])
                    {
                        if(world.getBattle() == null)
                        {
                            world.getGrid().getThePlayer().right();
                        }
                    }
                    if(k[KeyEvent.VK_E])
                    {
                        if(world.getBattle() == null)
                        {
                            System.out.println("Game menu not yet implemented.");
                        }
                    }
                    if(k[KeyEvent.VK_1])
                    {
                        if(world.getBattle() != null)
                        {
                            world.getBattle().turn(0);
                        }
                    }
                    if(k[KeyEvent.VK_2])
                    {
                        if(world.getBattle() != null)
                        {
                            world.getBattle().turn(1);
                        }
                    }
                    if(k[KeyEvent.VK_3])
                    {
                        if(world.getBattle() != null)
                        {
                            world.getBattle().turn(2);
                        }
                    }
                }
            });
    }
}