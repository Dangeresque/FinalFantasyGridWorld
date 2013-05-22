package RPGGrid.actor;

/**
 * An <code>Interactive</code> is an entity who can interact with ThePlayer.
 * <br />
 */
public interface Interactive
{
    /**
     * Interacts with the given player
     * @param a ThePlayer Object
     */
    public void interact(ThePlayer p);
}
