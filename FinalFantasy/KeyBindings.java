package FinalFantasy;

import java.util.*;
/**
 * This class contains the key bindings for all actions in the Final Fantasy game.
 * 
 * @author Shonee A. Freed-Doerr 
 * @version 1.0.0
 */
public class KeyBindings {
    // instance variables
    public static final char LEFT_KEY = 'A';
    public static final char RIGHT_KEY = 'D';
    public static final char FORWARD_KEY = 'W';
    public static final char BACK_KEY = 'S';
    public static ArrayList<java.lang.Character> lowerCase;

    /**
     * Constructor for objects of class KeyBindings
     */
    public KeyBindings()
    {
        // initialise instance variables
        lowerCase = new ArrayList<java.lang.Character>();
        char temp;
        for(int a = 97; a <=122; a++) {
            temp = (char) (a);
            lowerCase.add(temp);
        }
    }
    /**
     * Shifts lowercase letters into uppercase.
     * 
     * @param let  the letter to be changed to its uppercase form
     * @return     the letter in uppercase form
     */
    public static char capitalize(char let) {
        if(lowerCase.contains(let)) {
            int temp = (int) (let);
            temp += 32;
            return (char) (temp);
        }
        return let;
    }
}
