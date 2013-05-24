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
    private int battles;
    /**
     * Generic constructor for objects of class Character
     */
    public FFCharacter() {
        // initialise instance variables
        super(1,5,5,7);
        name = "testName";
        inventory = new ArrayList<Item>();
        spells = new ArrayList<Spell>();
        battles = 0;
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
        battles = 0;
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
        System.out.println("Placed " + i.toString() + " in the inventory.");
    }

    /**
     * Takes an item to the inventory
     * 
     * @param  ind  index of the item to be removed from the inventory
     */
    public Item takeItem(int ind) {
        Item i = inventory.get(ind);
        inventory.remove(ind);
        System.out.println("Removed " + i.toString() + " from the inventory.");
        return i;
    }

    /**
     * Wears new armor. If armor is already equipped, the  old armor is placed n the inventory.
     * 
     * @param  arm  the character's armor
     */
    public void wear(Armor arm) {
        if(armor != null) {
            inventory.add(armor);
            System.out.println("Put away " + armor.toString() + ".");
        }
        armor = arm;
        System.out.println("Equipped " + armor.toString() + ".");
    }

    /**
     * Weilds a new weapon. If a weapon is already equipped, the old weapon is placed n the inventory.
     * 
     * @param  weap  the character's weapon
     */
    public void wield(Weapon weap) {
        if(weapon != null) {
            inventory.add(weapon);
            System.out.println("Put away " + weapon.toString() + ".");
        }
        weapon = weap;
        System.out.println("Equipped " + weapon.toString() + ".");
    }

    /**
     * levels up the Character
     */
    public void levelUp() {
        System.out.println("Level up!");
        System.out.println("Your attack and defense have increased.");
        setLevel((byte) (getLevel()+1));
        updateAttack();
        updateDefense();
    }

    /**
     * The accessor method for the <code>Armor</code> that the Character wears.
     * 
     * @return     the Character's armor
     */
    public Armor getArmor() {
        return armor;
    }

    /**
     * The accessor method for the <code>Weapon</code> that the Character weilds.
     * 
     * @return     the Character's weapon
     */ 
    public Weapon getWeapon() {
        return weapon;
    }

    /**
     * The accessor method for the ArrayList of the Character's spells.
     * 
     * @return     the Character's spells
     */ 
    public ArrayList<Spell> getSpells() {
        return spells;
    }

    /**
     * Adds one to the number of battles the character has completed.
     */
    public void addBattle() {
        battles++;
    }

    /**
     * checks if a level up should happen.
     */
    public void levelUpCheck() {
        if(battles >= (getLevel()*2)) {
            battles = 0;
            levelUp();
        }
    }
}