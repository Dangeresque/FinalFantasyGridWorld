package FinalFantasy;

/**
 * The <code>Weapon</code> class represents weaponry.
 * 
 * @author Shonee A. Freed-Doerr 
 * @version 1.0.0
 */
public class Weapon implements Item {
    // instance variables
    private int power;

    /**
     * Constructor for objects of class <code>Weapon</code>
     * 
     * @param  pwr  the weapon's power
     */
    public Weapon(int pwr)
    {
        // initialise instance variables
        power = pwr;
    }

    /**
     * The accessor method for the weapon's power
     * 
     * @return  power  the weapon's power
     */
    public int getPower() {
        return power;
    }

    /**
     * The mutator method for the weapon's power
     * 
     * @param  pwr  the weapon's power
     */
    public void setPower(int pwr) {
        power = pwr;
    }

    public String toString() {
        String ret = "Weapon " + power;
        return ret;
    }
}