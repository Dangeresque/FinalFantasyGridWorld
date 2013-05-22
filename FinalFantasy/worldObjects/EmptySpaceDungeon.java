package FinalFantasy.worldObjects;

import RPGGrid.actor.*;
import RPGGrid.input.*;

/**
 * An <code>EmptySpaceDungeon<code> moves the player to its location,
 * and thus enableing movement of the player, and has a random
 * chance to initiate a battle.
 */
public class EmptySpaceDungeon extends WorldObject
{
    public void interact(ThePlayer p) {
        p.moveTo(getLocation());
        
        if(Math.random() > 0.9)
        {
            System.out.println("A battle Started!");
            //A battle starts
            SoundPlayer.pause();
            SoundPlayer.play("battle");
        }
    }
}