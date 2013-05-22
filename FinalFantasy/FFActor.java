package FinalFantasy;

import java.util.*;
/**
 * Write a description of class FFActor here.
 * 
 * @author Shonee A. Freed-Doerr 
 * @version (a version number or a date)
 */
public abstract class FFActor {
    // instance variables
    private byte level;
    private int attack;
    private int defense;
    private int health;
    private int attFact;
    private int defFact;
    private int healFact;

    /**
     * Constructor for objects of class FFActor
     * 
     * @param  lvl  the level of the FFActor
     * @param  att  the attack factor of the FFActor
     * @param  def  the defense factor of the FFActor
     * @param  heal  the health factor of the FFActor
     */
    public FFActor(int lvl, int att, int def, int heal) {
        // initialise instance variables
        level = (byte) lvl;
        attFact = att;
        defFact = def;
        healFact = heal;
        updateAttack();
        updateDefense();
        updateHealth();
    }
    /**
     * The accessor method for the <code>level</code> instance variable.
     * 
     * @return  level  the FFActor's level
     */
    public byte getLevel() {
        return level;
    }
    /**
     * The accessor method for the <code>attack</code> instance variable.
     * 
     * @return  attack  the FFActor's attack
     */
    public int getAttack() {
        return attack;
    }
    /**
     * The accessor method for the <code>defense</code> instance variable.
     * 
     * @return  defense  the FFActor's defense
     */
    public int getDefense() {
        return defense;
    }
    /**
     * The accessor method for the <code>health</code> instance variable.
     * 
     * @return  health  the FFActor's health
     */
    public int getHealth() {
        return health;
    }
    /**
     * The accessor method for the <code>attFact</code> instance variable.
     * 
     * @return  attFact  the FFActor's attack factor
     */
    public int getAttFact() {
        return attFact;
    }
    /**
     * The accessor method for the <code>defFact</code> instance variable.
     * 
     * @return  defFact  the FFActor's defense factor
     */
    public int getDefFact() {
        return defFact;
    }
    /**
     * The accessor method for the <code>healFact</code> instance variable.
     * 
     * @return  healFact  the FFActor's health factor
     */
    public int getHealFact() {
        return healFact;
    }
    /**
     * The mutator method for the <code>level</code> instance variable.
     * 
     * @param  lvl  the FFActor's level
     */
    public void setLevel(byte lvl) {
        level = lvl;
    }
    /**
     * The mutator method for the <code>attack</code> instance variable.
     * 
     * @param  a  the FFActor's attack
     */
    public void setAttack(int a) {
        attack = a;
    }
    /**
     * The mutator method for the <code>defense</code> instance variable.
     * 
     * @param  d  the FFActor's defense
     */
    public void setDefense(int d) {
        defense = d;
    }
    /**
     * The mutator method for the <code>health</code> instance variable.
     * 
     * @param  h  the FFActor's health
     */
    public void setHealth(int h) {
        health = h;
    }
    /**
     * The mutator method for the <code>attFact</code> instance variable.
     * 
     * @param  af  the FFActor's attack factor
     */
    public void setAttFact(int af) {
        attFact = af;
    }
    /**
     * The mutator method for the <code>defFact</code> instance variable.
     * 
     * @param  df  the FFActor's defense factor
     */
    public void setDefFact(int df) {
        defFact = df;
    }
    /**
     * The mutator method for the <code>healFact</code> instance variable.
     * 
     * @param  hf  the FFActor's health factor
     */
    public void setHealFact(int hf) {
        healFact = hf;
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
     * updates the FFActor's health value.
     */
    public void updateHealth() {
        health = level * healFact;
    }
}