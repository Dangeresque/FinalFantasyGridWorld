package RPGGrid.actor;

import RPGGrid.grid.Location;
import RPGGrid.world.*;

import FinalFantasy.worldObjects.*;
import FinalFantasy.*;

/**
 * A <code>ThePlayer<code> is the entity through which the user interacts with the game.
 */
public class ThePlayer extends Actor
{
    private RPGWorld world;
    private FFCharacter character;

    /**
     * Constructs a player with a reference to a given world, and removes any color
     * filters
     * @param a RPGWorld for the player to reference
     */
    public ThePlayer(RPGWorld w, FFCharacter c)
    {
        setColor(null);
        world = w;
        character = c;
    }

    /**
     * Gives the Character reperesented by ThePlayer.
     * @return the Character stored in ThePlayer
     */
    public FFCharacter getFFCharacter()
    {
        return character;
    }

    /**
     * Causes the player to interact with the WorldObject above it,
     * moves the camera if necisary, and changes the icon of the player.
     */
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
            world.add(getLocation(), new ThePlayer(world, character));
        } else {
            world.add(getLocation(), new ThePlayer(world, character));
            world.getJFrame().repaint();
        }
    }

    /**
     * Causes the player to interact with the WorldObject below it,
     * moves the camera if necisary, and changes the icon of the player.
     */
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
            world.add(getLocation(), new ThePlayerDown(world, character));
        } else {
            world.add(getLocation(), new ThePlayerDown(world, character));
            world.getJFrame().repaint();        
        }
    }

    /**
     * Causes the player to interact with the WorldObject to its left,
     * moves the camera if necisary, and changes the icon of the player.
     */
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
            world.add(getLocation(), new ThePlayerLeft(world, character));
        } else {
            world.add(getLocation(), new ThePlayerLeft(world, character));
            world.getJFrame().repaint();
        }
    }

    /**
     * Causes the player to interact with the WorldObject to its right,
     * moves the camera if necisary, and changes the icon of the player.
     */
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
            world.add(getLocation(), new ThePlayerRight(world, character));
        } else {
            world.add(getLocation(), new ThePlayerRight(world, character));
            world.getJFrame().repaint();
        }
    }
}

/**
 * A ThePlayer identicle to its superclass, save for its unique icon.
 */
class ThePlayerDown extends ThePlayer
{
    /**
     * Constructs a player identicle with ThePlayer, but with a unique icon.
     * @param a RPGWorld for the player to reference
     */
    public ThePlayerDown(RPGWorld w, FFCharacter c)
    {
        super(w, c);
    }
}

/**
 * A ThePlayer identicle to its superclass, save for its unique icon.
 */
class ThePlayerLeft extends ThePlayer
{
    /**
     * Constructs a player identicle with ThePlayer, but with a unique icon.
     * @param a RPGWorld for the player to reference
     */
    public ThePlayerLeft(RPGWorld w, FFCharacter c)
    {
        super(w, c);
    }
}

/**
 * A ThePlayer identicle to its superclass, save for its unique icon.
 */
class ThePlayerRight extends ThePlayer
{
    /**
     * Constructs a player identicle with ThePlayer, but with a unique icon.
     * @param a RPGWorld for the player to reference
     */
    public ThePlayerRight(RPGWorld w, FFCharacter c)
    {
        super(w, c);
    }
}