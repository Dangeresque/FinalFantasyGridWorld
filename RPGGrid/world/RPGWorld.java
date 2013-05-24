/*
 * This is basically a simplified ActorWorld class from gridworld, although the only surviving method from ActorWorld is add().
 */

package RPGGrid.world;

import FinalFantasy.*;

import RPGGrid.grid.Grid;
import RPGGrid.grid.Location;
import RPGGrid.actor.*;
import RPGGrid.input.*;

/**
 * A <code>RPGWorld<code> provides a better way to add actors than World,
 * and contains less unnessicary/unused methods than ActorWorld for the sake of
 * simplicity.
 * @author SeanMacLane, add() is by the College Board
 */
public class RPGWorld extends World<Actor>
{      
    private SoundPlayer s;
    private Battle batt;

    /**
     * Constructs a RPGWorld with a given grid.
     * @param grid The grid which the RPGWorld will contain
     * @param sound The sound player which will play the music
     */
    public RPGWorld(Grid<Actor> grid, SoundPlayer sound)
    {
        super(grid);

        s = sound;
    }

    /**
     * Gets the battle that is happening in the grid.
     * @return the Battle in the grid
     */
    public Battle getBattle()
    {
        return batt;
    }

    /**
     * Sets batt to a new Battle
     * @param b The new battle to take place in the world
     */
    public void setBattle(Battle b)
    {
        batt = b;
    }

    /**
     * Returns the SoundPlayer for this world.
     * @return the current SoundPlayer
     */
    public SoundPlayer getSoundPlayer()
    {
        return s;
    }

    /**
     * This method was written by the College Board for ActorWorld.
     * 
     * Adds an actor to the grid at a given location.
     * @param loc: the location to add the actor to
     * @param occupant: the Actor to add to the grid
     */
    public void add(Location loc, Actor occupant)
    {
        occupant.putSelfInGrid(getGrid(), loc);
    }
}