package FinalFantasy.worldObjects;

import RPGGrid.actor.*;

/**
 * A <code>Person<code> tells the user something in a println.
 */
public class Person extends WorldObject {
    String message;
    
    /**
     * Constructs a person along with a custom message.
     * @param m: the string a person will say when interacted with
     */
    public Person(String m)
    {
        message = m;
    }
    
    /**
     * Prints out the Person's message when called
     * @param p: the player who initiated the method
     */
    public void interact(ThePlayer p)
    {
        System.out.println(message);
    }
}