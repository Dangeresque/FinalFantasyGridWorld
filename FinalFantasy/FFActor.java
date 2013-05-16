package FinalFantasy;

import RPGGrid.grid.*;
import RPGGrid.actor.*;
import java.util.*;
/**
 * Write a description of class FFActor here.
 * 
 * @author Shonee A. Freed-Doerr 
 * @version (a version number or a date)
 */
public abstract class FFActor extends Actor {
    // instance variables
    private byte level;
    private Armor armor;
    private Weapon weapon;
    private int attack;
    private int defense;
    private int attFact;
    private int defFact;
    private ArrayList<Spell> spells;

    /**
     * Constructor for objects of class FFActor
     */
    public FFActor()
    {
        // initialise instance variables
        level = 1;
        updateAttack();
        updateDefense();
        spells = new ArrayList<Spell>();
    }
    /**
     * The accessor method for the <code>level</code> instance variable.
     * 
     * @return     the FFActor's level
     */
    public int getLevel() {
        return level;
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
    /**
     * updates the FFActor's attack value.
     */
    public void updateAttack() {
        attack = level * attFact;
    }
    /**
     * updates the FFActor's defense value.
     */
    public void updateDefense() {
        defense = level * defFact;
    }
    /**
     * Gives the character a suit of armor
     * 
     * @param arm  the Character's new suit of armor
     */
    public void wear(Armor arm) {
        armor = arm;
    }
    public void setLevel(byte lvl) {
        level = lvl;
    }
}