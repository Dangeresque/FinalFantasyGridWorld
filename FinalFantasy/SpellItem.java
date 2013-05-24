package FinalFantasy;

/**
 * Write a description of class SpellItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpellItem implements Item {
    // instance variables
    private Spell spell;

    /**
     * Constructor for objects of class SpellItem
     */
    public SpellItem(Spell s)
    {
        // initialise instance variables
        spell = s;
    }

    /**
     * Returns the Spell contained in the SpellItem
     * @return the Spell in the SpellItem
     */
    public Spell getSpell() {
        return spell;
    }

    /**
     * Sets the Spell in the SpellItem to a new spell
     * @param s The Spell to put in the SpellItem
     */
    public void setSpell(Spell s) {
        spell = s;
    }

    /**
     * Gives the type of item along with its unique value
     * @return a String describing the item
     */
    public String toString() {
        String ret = "Spell " + spell;
        return ret;
    }
}