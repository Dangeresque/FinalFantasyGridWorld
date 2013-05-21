package FinalFantasy.worldObjects;

import RPGGrid.actor.*;
import RPGGrid.grid.*;

public class EmptySpaceTown extends WorldObject {
    public void interact(ThePlayer p)
    {
        p.moveTo(getLocation());
    }
}