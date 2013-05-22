package FinalFantasy.worldObjects;

import RPGGrid.actor.*;

/**
 * A <code>Door<code> turns into empty space if the player interacting
 * with it has the door's key in its inventory.
 */
public class Door extends WorldObject {
    // have constructor with key (item) name
    private String keyName;
    
    /**
     * Constructs a door along with the name of its key.
     * @param key: the name of the item that must be used to open the door
     */
    public Door(String key)
    {
        keyName = key;
    }

    /**
     * Allows the player to pass through it if the player has its key.
     * @param p the player who is trying to pass through the door
     */
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