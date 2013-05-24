package FinalFantasy.worldObjects;

import RPGGrid.actor.*;
import FinalFantasy.*;

/**
 * A <code>GridItem<code> is an object on the grid that contains
 * items for the player to pick up.
 * @author Sean MacLane
 */
public class GridItem extends WorldObject {
    private Item containedItem;
    private boolean given = false;

    /**
     * Constructs a GridItem along with the name of the item it contains
     * @param contained the name of the item contained
     */
    public GridItem(Item contained)
    {
        containedItem = contained;
    }

    /**
     * Gives the player its item if not already given, otherwise acts as a wall.
     * If the player has no weapon/armor, or the current weapon/ armor is weaker
     * than the found one, the new on will be equipped.
     * @param the player trying to get the item
     */
    public void interact(ThePlayer p)
    {
        if (given == false)
        {
            p.getFFCharacter().giveItem(containedItem);
            System.out.println("Thou hast obtained ye " + containedItem.toString());
            given = true;
            if (containedItem instanceof Weapon)
            {
                Weapon contWeapon = (Weapon) containedItem;
                if(p.getFFCharacter().getWeapon() == null
                || p.getFFCharacter().getWeapon().getPower() < contWeapon.getPower())
                {
                    p.getFFCharacter().wield(contWeapon);
                }
            } else if(containedItem instanceof Armor) {
                Armor contArmor = (Armor) containedItem;
                if(p.getFFCharacter().getArmor() == null
                || p.getFFCharacter().getArmor().getStrength() < contArmor.getStrength())
                {
                    p.getFFCharacter().wear(contArmor);
                }
            }
        }
    }
}