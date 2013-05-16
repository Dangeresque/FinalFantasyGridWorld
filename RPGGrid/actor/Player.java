package RPGGrid.actor;

import RPGGrid.grid.Grid;
import RPGGrid.grid.Location;

import java.awt.Color;

/**
 * An <code>Actor</code> is an entity with a color and direction that can act.
 * <br />
 * The API of this class is testable on the AP CS A and AB exams.
 */
public class Player extends Actor
{
    private Grid<Actor> grid;
    private Location location;
    private int direction;
    private Color color;

    /**
     * Constructs a blue actor that is facing north.
     */
    public Player()
    {
        color = null;
        direction = Location.NORTH;
        grid = null;
        location = null;
    }

    
}