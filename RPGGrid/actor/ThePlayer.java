package RPGGrid.actor;

import RPGGrid.grid.Grid;
import RPGGrid.grid.Location;
import RPGGrid.gui.*;
import RPGGrid.world.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import FinalFantasy.worldObjects.*;

import java.awt.Color;

public class ThePlayer extends Actor
{
    public RPGWorld world;
    public ThePlayer(RPGWorld w)
    {
        world = w;
    }

    public void keyPressed(KeyEvent arg0)
    {
        boolean[] keys = new boolean[KeyEvent.KEY_TYPED];
        keys[arg0.getKeyCode()] = true;

        if(keys[KeyEvent.VK_W])
        {
           up();
        }
        else if(keys[KeyEvent.VK_S])
        {
            down();
        }
        else if(keys[KeyEvent.VK_A])
        {
            left();
        }
        else if(keys[KeyEvent.VK_D])
        {
            right();
        }

        //repaint();
    }

    public void up()
    {
        Location l = getLocation().getAdjacentLocation(Location.NORTH);
        Location current = getLocation();
        if (getGrid().get(l) instanceof Interactive)
        {
            WorldObject a = (WorldObject) getGrid().get(l);
            a.interact(this);
        }
        if (getLocation() != current)
        {
            EmptySpaceDungeon e = new EmptySpaceDungeon();
            e.putSelfInGrid(getGrid(), current);

            world.getJFrame().getDisplay().moveLocation(-1, 0);
        }
    }

    public void down()
    {
        Location l = getLocation().getAdjacentLocation(Location.SOUTH);
        Location current = getLocation();
        if (getGrid().get(l) instanceof Interactive)
        {
            WorldObject a = (WorldObject) getGrid().get(l);
            a.interact(this);
        }
        if (getLocation() != current)
        {
            EmptySpaceDungeon e = new EmptySpaceDungeon();
            e.putSelfInGrid(getGrid(), current);

            world.getJFrame().getDisplay().moveLocation(1, 0);
        }
    }

    public void left()
    {
        Location l = getLocation().getAdjacentLocation(Location.WEST);
        Location current = getLocation();
        if (getGrid().get(l) instanceof Interactive)
        {
            WorldObject a = (WorldObject) getGrid().get(l);
            a.interact(this);
        }
        if (getLocation() != current)
        {
            EmptySpaceDungeon e = new EmptySpaceDungeon();
            e.putSelfInGrid(getGrid(), current);

            world.getJFrame().getDisplay().moveLocation(0, -1);
        }
    }

    public void right()
    {
        Location l = getLocation().getAdjacentLocation(Location.EAST);
        Location current = getLocation();
        if (getGrid().get(l) instanceof Interactive)
        {
            WorldObject a = (WorldObject) getGrid().get(l);
            a.interact(this);
        }
        if (getLocation() != current)
        {
            EmptySpaceDungeon e = new EmptySpaceDungeon();
            e.putSelfInGrid(getGrid(), current);

            world.getJFrame().getDisplay().moveLocation(0, 1);
        }
    }
}