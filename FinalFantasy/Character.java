package FinalFantasy;

import RPGGrid.grid.*;
import RPGGrid.actor.*;
import RPGGrid.input.*;
import java.util.*;
/**
 * The <code>Character</code> class represents a player character.
 * 
 * @author Shonee A. Freed-Doerr
 * @version 1.0.0
 */
public class Character extends FFActor implements ThePlayer
{
    // instance variables
    private String name;
    private KeyReader reader;
    private ArrayList<Item> inventory;

    /**
     * Generic constructor for objects of class Character
     */
    public Character()
    {
        // initialise instance variables
        name = "testName";
        reader = new KeyReader();
        inventory = new ArrayList<Item>();
    }
    /**
     * Parametric constructor for objects of class Character
     * 
     * @param  n   the Character's name 
     */
    public Character(String n)
    {
        // initialise instance variables
        name = n;
        reader = new KeyReader();
    }
    /**
     * The accessor method for the <code>name</code> instance variable.
     * 
     * @return     the character's name.
     */
    public String getName() {
        return name;
    }
    /**
     * The accessor method for the Character's inventory.
     * 
     * @return     the character's inventory
     */
    public ArrayList getInventory() {
        return inventory;
    }
    /**
     * The method for standard forward movement.
     */
    public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
    }
    /**
     * The basic operative act method for the Character.
     */
    public void act() {
        char key = reader.readOneKey();
        key = KeyBindings.capitalize(key);
        if (key == KeyBindings.LEFT_KEY) {
            setDirection(Location.WEST);
        } else if (key == KeyBindings.RIGHT_KEY) {
            setDirection(Location.EAST);
        } else if (key == KeyBindings.FORWARD_KEY) {
            setDirection(Location.NORTH);
        } else if (key == KeyBindings.BACK_KEY) {
            setDirection(Location.SOUTH);
        }
        move();
    }
    /**
     * Adds an item to the inventory
     * 
     * @param  i   item to be added to the inventory
     */
    public void giveItem(Item i) {
        inventory.add(i);
    }
    /**
     * Takes an item to the inventory
     * 
     * @param ind  index of the item to be removed from the inventory
     */
    public Item takeItem(int ind) {
        Item i = inventory.get(ind);
        inventory.remove(ind);
        return i;
    }
    public void wear(Armor arm) {
        if(getArmor() != null)
            inventory.add(getArmor());
        super.wear(arm);
    }
    /**
     * levels up the Character
     */
    public void levelUp() {
        setLevel((byte) (getLevel()+1));
        updateAttack();
        updateDefense();
    }
}