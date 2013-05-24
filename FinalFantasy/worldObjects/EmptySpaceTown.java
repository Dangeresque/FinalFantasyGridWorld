package FinalFantasy.worldObjects;

import RPGGrid.actor.*;
import RPGGrid.grid.*;

/**
 * An <code>EmptySpaceTown<code> moves the player to its location,
 * and thus enableing movement of the player.
 * @author Sean MacLane
 */
public class EmptySpaceTown extends WorldObject {
    
    /**
     * Moves the player to its location.
     * @param p: the player to move
     */
    public void interact(ThePlayer p)
    {
        p.moveTo(getLocation());
    }
}