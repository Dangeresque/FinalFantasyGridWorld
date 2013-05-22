package FinalFantasy;

import java.util.*;
/**
 * The <code>Character</code> class represents a player character.
 * 
 * @author Shonee A. Freed-Doerr
 * @version 1.0.0
 */
public class FFCharacter extends FFActor
{
    // instance variables
    private String name;
    private ArrayList<Item> inventory;
    private Armor armor;
    private Weapon weapon;
    private ArrayList<Spell> spells;

    /**
     * Generic constructor for objects of class Character
     */
    public FFCharacter() {
        // initialise instance variables
        super(1,5,5,7);
        name = "testName";
        inventory = new ArrayList<Item>();
        spells = new ArrayList<Spell>();
    }
    /**
     * Parametric constructor for objects of class Character
     * 
     * @param  n   the Character's name
     * @param  lvl the Character's level
     */
    public FFCharacter(String n, int lvl)
    {
        // initialise instance variables
        super(lvl,5,5,7);
        name = n;
        inventory = new ArrayList<Item>();
        spells = new ArrayList<Spell>();
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
    public ArrayList<Item> getInventory() {
        return inventory;
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
    /**
     * Wears new armor. If armor is already equipped, the  old armor is placed n the inventory.
     * 
     * @param  arm  the character's armor
     */
    public void wear(Armor arm) {
        if(armor != null)
            inventory.add(armor);
        armor = arm;
    }
    /**
     * Weilds a new weapon. If a weapon is already equipped, the old weapon is placed n the inventory.
     * 
     * @param  weap  the character's weapon
     */
    public void wield(Weapon weap) {
        if(weapon != null)
            inventory.add(weapon);
        weapon = weap;
    }
    /**
     * levels up the Character
     */
    public void levelUp() {
        setLevel((byte) (getLevel()+1));
        updateAttack();
        updateDefense();
    }
    /**
     * The accessor method for the <code>Armor</code> that the FFActor wears.
     * 
     * @return     the FFActor's armor
     */
    public Armor getArmor() {
        return armor;
    }
    /**
     * The accessor method for the <code>Weapon</code> that the FFActor weilds.
     * 
     * @return     the FFActor's weapon
     */ 
    public Weapon getWeapon() {
        return weapon;
    }
}