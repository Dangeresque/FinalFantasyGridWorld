package FinalFantasy;

/**
 * A <code>Key<code> contains the string necisary to open a door.
 */
public class Key implements Item
{
    private String name;

    /**
     * Constructs a key with the name needed to open a particular door.
     * @param n: the string to open the door with
     */
    public Key(String n)
    {
        name = n;
    }

    /**
     * Gives the name (likeley to the door).
     * @return the name stored in the Key
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gives the type of item along with its unique value
     * @return a String describing the item
     */
        public String toString() {
        return "Key " + name;
    }
}