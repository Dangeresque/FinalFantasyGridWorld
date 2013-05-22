package RPGGrid.actor;
/**
 * A <code>WorldObject</code> is an implementation of Interactive that provides a default interact method
 * which does not do anything and is ideal for use as an obstacle for the player or a Interactive placeholder.
 * <br />
 */
public class WorldObject extends Actor implements Interactive
{
    /**
     * Interacts with the given player, but does nothing.
     * @param the player to do nothing to
     */
    public void interact(ThePlayer p)
    {
        
    }
}
