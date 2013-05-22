package FinalFantasy;

import RPGGrid.input.*;
/**
 * Represents a battle between the character and an enemy
 * 
 * @author Shonee A. Freed-Doerr + Sean MacLane
 * @version 1.0.0
 */
public class Battle {
    // instance variables
    private FFCharacter character;
    private Enemy enemy;

    /**
     * Constructor for objects of class Battle
     * 
     * @param  c  the player Character
     */
    public Battle(FFCharacter c)
    {
        // initialise instance variables
        character = c;
        enemy = new Enemy(character.getLevel());
        
        SoundPlayer.pause();
        SoundPlayer.play("battle");
        System.out.println("TheBattleIsOver");
        SoundPlayer.pause();
        SoundPlayer.play("dungeon");
        
        
    }
}
