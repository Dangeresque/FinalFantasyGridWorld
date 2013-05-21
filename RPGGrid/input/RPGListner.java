package RPGGrid.input;

import RPGGrid.world.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class RPGListner
{
    RPGWorld world;
    public RPGListner(RPGWorld w)
    {
        world = w;
        world.getJFrame().addKeyListener(new KeyAdapter() 
            {
                public void keyPressed(KeyEvent arg0)
                {
                    boolean[] keys = new boolean[KeyEvent.KEY_TYPED];
                    keys[arg0.getKeyCode()] = true;

                    if(keys[KeyEvent.VK_W])
                    {
                        world.getGrid().getThePlayer().up();
                    }
                    if(keys[KeyEvent.VK_S])
                    {
                        world.getGrid().getThePlayer().down();
                    }
                    if(keys[KeyEvent.VK_A])
                    {
                        world.getGrid().getThePlayer().left();
                    }
                    if(keys[KeyEvent.VK_D])
                    {
                        world.getGrid().getThePlayer().right();
                    }
                }
            });
    }
}