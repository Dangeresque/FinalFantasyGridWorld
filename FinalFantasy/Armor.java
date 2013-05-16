package FinalFantasy;

import RPGGrid.actor.*;

/**
 * The <code>Armor</code> class is the framework for any form of armor.
 * 
 * @author Shonee A. Freed-Doerr
 * @version 1.0.0
 */
public class Armor implements Item {
    // instance variables
    private int strength;

    /**
     * Constructor for objects of class <code>Armor</code>; <br>
     * <bold>Precondition:</bold> toughness is a positive int
     */
    public Armor(int toughness, String bodyPart) {
        // initialise instance variables
        strength = toughness;
    }

    /**
     * The accessor method for <code>strength</code>.
     * 
     * @return     the armor's strength
     */
    public int getStrength() {
        return strength;
    }
}