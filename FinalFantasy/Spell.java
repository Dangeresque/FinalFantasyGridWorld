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
        damage = 10;
    }
    /**
     * The accessor method for the Spell's <code>name</code>.
     * 
     * @return  name  the character's name
     */
    public String getName()
    {
        return name;
    }
    /**
     * The mutator method for the Spell's <code>name</code>.
     * 
     * @param  n  the character's name
     */
    public void setName(String n)
    {
        name = n;
    }
}
