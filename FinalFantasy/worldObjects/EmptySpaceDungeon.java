package FinalFantasy.worldObjects;

import RPGGrid.actor.*;

public class EmptySpaceDungeon extends WorldObject
{
    public void interact(ThePlayer p) {
        p.moveTo(getLocation());
        
        if(Math.random() > 0.9)
        {
            System.out.println("A battle Started!");
            //A battle starts
        }
    }
}