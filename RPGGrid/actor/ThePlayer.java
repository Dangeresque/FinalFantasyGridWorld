package RPGGrid.actor;

import RPGGrid.grid.Location;
import RPGGrid.world.*;

import FinalFantasy.worldObjects.*;

public class ThePlayer extends Actor
{
    public RPGWorld world;
    public ThePlayer(RPGWorld w)
    {
        setColor(null);
        world = w;
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
            world.add(getLocation(), new ThePlayer(world));
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
            world.add(getLocation(), new ThePlayerDown(world));
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
            world.add(getLocation(), new ThePlayerLeft(world));
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
            world.add(getLocation(), new ThePlayerRight(world));
        }
    }
}

class ThePlayerDown extends ThePlayer
{
    public ThePlayerDown(RPGWorld w)
    {
        super(w);
    }
}

class ThePlayerLeft extends ThePlayer
{
    public ThePlayerLeft(RPGWorld w)
    {
        super(w);
    }
}

class ThePlayerRight extends ThePlayer
{
    public ThePlayerRight(RPGWorld w)
    {
        super(w);
    }
}