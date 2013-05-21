/*
 * This is basically a simplified ActorWorld class.
 */
package RPGGrid.world;

import RPGGrid.grid.Grid;
import RPGGrid.grid.Location;
import RPGGrid.actor.*;

public class RPGWorld extends World<Actor>
{      
    public RPGWorld(Grid<Actor> grid)
    {
        super(grid);
    }

    public void add(Location loc, Actor occupant)
    {
        occupant.putSelfInGrid(getGrid(), loc);
    }
}