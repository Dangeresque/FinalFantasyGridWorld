package FinalFantasy.worldObjects;

import RPGGrid.actor.*;

/**
 * A <code>GridItem<code> is an object on the grid that contains
 * items for the player to pick up.
 */
public class GridItem extends WorldObject {
    // add constructor with item as an input
    private String containedItem;
    private boolean given = false;
    
    /**
     * Constructs a GridItem along with the name of the item it contains
     * @param contained the name of the item contained
     */
    public GridItem(String contained)
    {
        containedItem = contained;
    }

    /**
     * Gives the player its item if not already given, otherwise acts as a wall.
     * @param the player trying to get the item
     */
    public void interact(ThePlayer p)
    {
        if (given == false)
        {
            // add item to inventory
            System.out.println("Thou hadst obtained an item.");
            given = true;
        }
    }
}