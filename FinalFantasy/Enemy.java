package FinalFantasy;

/**
 * The standard enemy in the Final Fantasy game.
 * 
 * @author Shonee A. Freed-Doerr
 * @version 1.0.0
 */
public class Enemy extends FFActor {
    /**
     * Constructor for objects of class Enemy
     * 
     * @param  lvl  the level of the Enemy
     */
    public Enemy(int lvl) {
        super(lvl,4,4,4);
    }
}