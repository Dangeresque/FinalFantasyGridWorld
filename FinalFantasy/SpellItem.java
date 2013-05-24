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

    public Spell getSpell() {
        return spell;
    }

    public void setSpell(Spell s) {
        spell = s;
    }

    public String toString() {
        String ret = "Spell " + spell;
        return ret;
    }
}