package FinalFantasy;

import RPGGrid.input.*;

import java.io.*;

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
    private SoundPlayer s;
    private File battle;
    private File dungeon;

    /**
     * Constructor for objects of class Battle
     * 
     * @param  c  the player Character
     */
    public Battle(FFCharacter c, SoundPlayer sound)
    {
        // initialise instance variables
        s = sound;
        battle = new File("battle.wav");
        dungeon = new File("dungeon.wav");
        
        character = c;
        enemy = new Enemy(character.getLevel());
        
        s.pause();
        s.setFile(battle);
        s.play();
        System.out.println("TheBattleIsOver");
        s.pause();
        s.setFile(dungeon);
        s.play();
        
        
    }
}
