package FinalFantasy.worldObjects;

import RPGGrid.actor.*;
import RPGGrid.grid.*;

/**
 * A <code>Portal<code> transports the player to a new grid.
 */
public class Portal extends WorldObject
{
    private RPGGrid grid;

    /**
     * Constructs a Portal with the grid that the portal leads to.
     * @param g: the grid that the portal will lead to
     */
    public Portal(RPGGrid g)
    {
        grid = g;
    }

    /**
     * Brings the player to another grid.
     * @param p: the player to move to another grid
     */
    public void interact(ThePlayer p)
    {
        //Bring the player to another grid.

        //temporary
        System.out.println("A spell keeps you from leaving this room");
    }
}