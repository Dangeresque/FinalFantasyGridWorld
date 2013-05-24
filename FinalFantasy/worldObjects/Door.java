package FinalFantasy.worldObjects;

import FinalFantasy.*;

import RPGGrid.actor.*;

import java.util.ArrayList;

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
        for (Item k : getKeys(p))
        {
            Key K = (Key) k;
            if (K.getName().equals(keyName))
            {
                System.out.println("Thou use-ith thine key to open ye door.");
                p.moveTo(getLocation());
                return;
            }
        }
        System.out.println("Thou needidst a key");
    }

    /**
     * Gets an ArrayList of items which are all keys so interact()
     * can more efficiently find out if the player has the key.
     * @param p the player to search the inventory of
     */
    public ArrayList<Item> getKeys(ThePlayer p)
    {
        ArrayList<Item> toReturn = new ArrayList<Item>();
        for(Item i : p.getFFCharacter().getInventory())
        {
            if (i instanceof Key)
            {
                toReturn.add(i);
            }
        }
        return toReturn;
    }
}
