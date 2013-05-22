package FinalFantasy;

/**
 * The <code>Armor</code> class is the framework for any form of armor.
 * 
 * @author Shonee A. Freed-Doerr
 * @version 1.0.0
 */
public class Armor implements Item {
    // instance variables
    private Integer strength;

    /**
     * Constructor for objects of class <code>Armor</code>; <br>
     * <bold>Precondition:</bold> toughness is a positive int
     * 
     * @param  str  the Armor's strength
     */
    public Armor(int str) {
        // initialise instance variables
        strength = str;
    }
    /**
     * The accessor method for the Armor's <code>strength</code>.
     * 
     * @return  strength  the armor's strength
     */
    public int getStrength() {
        return strength;
    }
    /**
     * The accessor method for the Armor's <code>strength</code>.
     * 
     * @param  str  the armor's strength
     */
    public void setStrength(int str) {
        strength = str;
    }
}