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
    public GridItem(String contained)
    {
        containedItem = contained;
    }
    
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