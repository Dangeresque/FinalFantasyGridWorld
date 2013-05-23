package FinalFantasy;

import java.util.*;
/**
 * Represents a battle between the character and an enemy
 * 
 * @author Shonee A. Freed-Doerr 
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
    }
    /**
     * This method causes one FFActor to attack the other
     * 
     * @param  which  a boolean representing which FFActor is the attacker <br>
     *                the character is true, the enemy is false 
     */
    public void attack(boolean chara) {
        FFActor attacker;
        FFActor defender;
        if (chara) {
            attacker = character;
            defender = enemy;
        } else {
            attacker = enemy;
            defender = character;
        }
        int attackVal = attacker.getAttack()*2;
        int defenseVal = defender.getDefense()*3;
        if (chara) {
            Weapon weap = ((FFCharacter) attacker).getWeapon();
            attackVal += weap.getPower();
        } else {
            Armor arm = ((FFCharacter) defender).getArmor();
            defenseVal += arm.getStrength();
        }
        int damVal = 0;
        if (attackVal < defenseVal) {
            if (Math.random() <= 0.1) {
                defender.setHealth(defender.getHealth()-1);
                damVal = 1;
            }
        } else if (attackVal == defenseVal) {
            if (Math.random() <= 0.5) {
                defender.setHealth(defender.getHealth()-2);
                damVal = 2;
            }
        } else if (attackVal > defenseVal) {
            if (Math.random() >= 0.1) {
                damVal = (attackVal-defenseVal)/2;
                defender.setHealth(defender.getHealth()-damVal);
            }
        }
        if (chara) {
            System.out.println("You dealt " + damVal + " damage!");
            System.out.print("Enemy ");
        } else {
            System.out.println("You took " + damVal + " damage!");
            System.out.print("Character ");
        }
        System.out.println("health remaining: " + defender.getHealth() + ".");
    }
    /**
     * This method causes you to cast a spell.
     * 
     * @param  spell  the spell being cast
     */
    public void castSpell(Spell spell) {
        enemy.setHealth(enemy.getHealth() - spell.getDamage());
        System.out.println("You dealt " + spell.getDamage() + " damage.");
        System.out.println("Enemy health remaining: " + enemy.getHealth() + ".");
    }
    /**
     * Attempt to flee the battle.
     */
    public void flee() {
        if (Math.random() <= 0.6) {
            System.out.println("Got away safely!");
            endBattle();
        } else {
            System.out.println("Failed to escape!");
        }
    }
    /**
     * Ends the battle.
     */
    public void endBattle() {
        System.out.println("For now, you're stuck in this battle...");
        System.out.println("FOREVER!");
        System.out.println("We apologize for the inconvenience.");
    }
    /**
     * This method takes one turn.
     * 
     * @param  choice  the player's choice of action
     */
    public void turn(int choice) {
        if(choice == 0) {
            attack(true);
        } else if (choice == 1) {
            chooseSpell();
        } else if (choice == 2) {
            flee();
        }
        if (enemy.getHealth() <= 0) {
            endBattle();
        } else {
            attack(false);
        }
    }
    /**
     * Chooses the spell the character will use.
     */
    public void chooseSpell() {
        //Sean, I need a way for them to choose their spell. For now:
        ArrayList<Spell> spells = character.getSpells();
        int index = (int) (Math.random()) * spells.size();
        castSpell(spells.get(index));
    }
}