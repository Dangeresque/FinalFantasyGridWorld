package FinalFantasy;

import RPGGrid.world.*;
import RPGGrid.grid.*;

import java.util.*;
import java.io.*;
/**
 * Represents a battle between the character and an enemy
 * 
 * @author Shonee A. Freed-Doerr and Sean MacLane
 * @version 1.0.0
 */
public class Battle {
    // instance variables
    private FFCharacter character;
    private Enemy enemy;
    private RPGWorld world;

    /**
     * Constructor for objects of class Battle and clears 
     * the terminal.
     * 
     * @param  c  the player Character
     * @param w The RPGWorld the battle takes place in
     */
    public Battle(FFCharacter c, RPGWorld w)
    {
        // initialise instance variables
        System.out.print('\u000C');
        System.out.println("A battle started");
        character = c;
        enemy = new Enemy(character.getLevel());
        world = w;
        world.setBattle(this);
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
            System.out.println("You are attacking the enemy!");
        } else {
            attacker = enemy;
            defender = character;
            System.out.println("The enemy is attacking you!");
        }
        int attackVal = attacker.getAttack()*2;
        int defenseVal = defender.getDefense()*3;
        if (chara && character.getWeapon() != null) {
            Weapon weap = ((FFCharacter) attacker).getWeapon();
            attackVal += weap.getPower();
        } else if (character. getArmor() != null) {
            Armor arm = ((FFCharacter) defender).getArmor();
            defenseVal += arm.getStrength();
        }
        int damVal = 0;
        if (attackVal < defenseVal) {
            if (Math.random() <= 0.7) {
                defender.setHealth(defender.getHealth()-1);
                damVal = 1;
                System.out.println("A glancing blow.");
            } else {
                System.out.print("The blow failed to injure ");
                if(chara) {
                    System.out.println("the enemy!");
                } else {
                    System.out.println("you!");
                }
            }
        } else if (attackVal == defenseVal) {
            if (Math.random() <= 0.8) {
                defender.setHealth(defender.getHealth()-2);
                damVal = 2;
                System.out.println("A light blow.");
            } else {
                System.out.print("The blow failed to injure ");
                if(chara) {
                    System.out.println("the enemy!");
                } else {
                    System.out.println("you!");
                }
            }
        } else if (attackVal > defenseVal) {
            if (Math.random() >= 0.95) {
                damVal = (attackVal-defenseVal)/2;
                defender.setHealth(defender.getHealth()-damVal);
                System.out.println("A strong hit!");
            } else {
                System.out.print("The blow failed to injure ");
                if(chara) {
                    System.out.println("the enemy!");
                } else {
                    System.out.println("you!");
                }
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
     * Lose the battle, keeps the player from playing after death by
     * throwing a null pointer exception.
     */
    public void youLose() {
        RPGGrid g = (RPGGrid) world.getGrid();
        //throws epic intentional error
        g.killThePlayer();
        world.setBattle(null);
        System.out.println("You lost the battle!");
        System.out.println("As you slowly die, you see the words 'null pointer exception'");
    }

    /**
     * Wins the battle.
     */
    public void endBattle() {
        character.addBattle();
        character.levelUpCheck();
        world.setBattle(null);
        System.out.println("You won the battle!");
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
            System.out.println("Thy enemy lies vanquished!");
            endBattle();
        } else {
            attack(false);
        }
        if (character.getHealth() <= 0) {
            System.out.println("Thou hast been defeated!");
            youLose();
        }
    }

    /**
     * Chooses the spell the character will use.
     */
    public void chooseSpell() {
        ArrayList<Spell> spells = character.getSpells();
        if(spells.size() != 0) {
            int index = (int) (Math.random()) * spells.size();
            castSpell(spells.get(index));
        } else {
            System.out.println("You have no spells to cast!");
            System.out.println("In a rush, you attack!");
            attack(true);
        }
    }
}