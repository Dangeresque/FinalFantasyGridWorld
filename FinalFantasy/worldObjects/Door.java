package FinalFantasy.worldObjects;

import RPGGrid.actor.*;

public class Door extends WorldObject {
    // have constructor with key (item) name
    public void interact(ThePlayer p)
    {
        /*if (player has no key)
        {
        System.out.println("Thou needidst a key");
        } else { */
        System.out.println("Thou use-ith thine key to open ye door.");
        p.moveTo(getLocation());
    }
}