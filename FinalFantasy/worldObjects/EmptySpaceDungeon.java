package FinalFantasy.worldObjects;

import RPGGrid.actor.*;
import RPGGrid.grid.*;

public class EmptySpaceDungeon extends WorldObject
{
    public void interact(ThePlayer p) {
        Actor tempActor = p.getStandingOn();
        Location tempLocation = p.getLocation();
        p.moveTo(getLocation());
        getGrid().put(tempLocation, tempActor);
        p.setStandingOn(this);
    }
}