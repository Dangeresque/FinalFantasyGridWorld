package FinalFantasy.worldObjects;

import RPGGrid.actor.*;

public class GridItem extends WorldObject {
    // add constructor with item as an input
    public void interact(ThePlayer p)
    {
        System.out.println("Thou hadst obtained an item.");
    }
}