package FinalFantasy;

/**
 * Write a description of class Spell here.
 * 
 * @author Shonee A. Freed-Doerr
 * @version 1.0.0
 */
public class Spell {
    // instance variables
    private String name;
    private int damage;

    /**
     * Constructor for objects of class Spell
     * 
     * @param  n  the Spell's name
     */
    public Spell(String n)
    {
        // initialise instance variables
        name = n;
        damage = 5;
    }

    /**
     * The accessor method for the Spell's name.
     * 
     * @return    the spell's name
     */
    public String getName()
    {
        return name;
    }

    /**
     * The accessor method for the Spell's damage.
     * 
     * @return    the spell's damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * The mutator method for the Spell's name.
     * 
     * @param  n  the spell's name
     */
    public void setName(String n)
    {
        name = n;
    }

    /**
     * The mutator method for the Spell's damage.
     * 
     * @param  n  the spell's damage
     */
    public void setDamage(int dam) {
        damage = dam;
    }
}