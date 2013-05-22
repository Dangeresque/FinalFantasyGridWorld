package FinalFantasy;

/**
 * Represents a battle between the character and an enemy
 * 
 * @author Shonee A. Freed-Doerr 
 * @version 1.0.0
 */
public class Battle {
    // instance variables
    private Character character;
    private Enemy enemy;

    /**
     * Constructor for objects of class Battle
     * 
     * @param  c  the player Character
     */
    public Battle(Character c)
    {
        // initialise instance variables
        character = c;
        enemy = new Enemy(character.getLevel());
    }
}
