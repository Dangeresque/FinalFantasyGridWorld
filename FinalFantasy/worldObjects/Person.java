package FinalFantasy.worldObjects;

import RPGGrid.actor.*;

/**
 * A <code>Person<code> tells the user something in a println.
 */
public class Person extends WorldObject {
    String message;
    
    public Person(String m)
    {
        message = m;
    }
    
    public void interact(ThePlayer p)
    {
        System.out.println(message);
    }
}