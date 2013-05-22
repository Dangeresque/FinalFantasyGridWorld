/*
 * This is basically a simplified ActorWorld class.
 */
package RPGGrid.world;

import RPGGrid.grid.Grid;
import RPGGrid.grid.Location;
import RPGGrid.actor.*;
import RPGGrid.input.*;

/**
 * A <code>RPGWorld<code> provides a better way to add actors than World,
 * and contains less unnessicary/unused methods than ActorWorld for the sake of
 * simplicity.
 */
public class RPGWorld extends World<Actor>
{      
    SoundPlayer s;
    
    /**
     * Constructs a RPGWorld with a given grid.
     * @param grid the grid which the RPGWorld will contain
     */
    public RPGWorld(Grid<Actor> grid, SoundPlayer sound)
    {
        super(grid);
        
        s = sound;
    }
    
    public SoundPlayer getSoundPlayer()
    {
        return s;
    }

    /**
     * Adds an actor to the grid at a given location.
     * @param loc: the location to add the actor to
     * @param occupant: the Actor to add to the grid
     */
    public void add(Location loc, Actor occupant)
    {
        occupant.putSelfInGrid(getGrid(), loc);
    }
}