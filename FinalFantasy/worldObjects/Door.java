package FinalFantasy.worldObjects;

import RPGGrid.actor.*;

/**
 * A <code>Door<code> turns into empty space if the player interacting
 * with it has the door's key in its inventory.
 */
public class Door extends WorldObject {
    // have constructor with key (item) name
    private String keyName;
    
    public Door(String key)
    {
        keyName = key;
    }

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