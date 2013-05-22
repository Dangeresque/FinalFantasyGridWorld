package FinalFantasy.worldObjects;

import RPGGrid.actor.*;
import RPGGrid.grid.*;

/**
 * An <code>EmptySpaceTown<code> moves the player to its location,
 * and thus enableing movement of the player.
 */
public class EmptySpaceTown extends WorldObject {
    public void interact(ThePlayer p)
    {
        p.moveTo(getLocation());
    }
}