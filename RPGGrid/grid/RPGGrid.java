package RPGGrid.grid;

import RPGGrid.actor.*;

/**
 * A <code>RPGGrid<code> is a custom grid that makes it easier to find instances of 
 * ThePlayer and can better implement grids with pre defined arrays for level
 * management.
 */
public class RPGGrid extends BoundedGrid
{
    private Object[][] occupantArray;

    /**
     * Constructs a RPGGrid that passes its values to the BoundedGrid
     * constructor.
     * @param rows: the number of rows in the grid
     * @param cols: the number of columns in the grid
     */
    public RPGGrid(int rows, int cols)
    {
        super(rows, cols);
    }

    /**
     * Sets the occupants of the grid to a pre-defined array, useful for level creation.
     * @param a: an array of objects
     */
    public void setOccupantArray(Object[][] a)
    {
        occupantArray = a;
    }

    /**
     * Finds the player in the grid.
     * @return the first instance of ThePlayer in the grid
     */
    public ThePlayer getThePlayer()
    {
        for (int r = 0; r < getNumRows(); r++)
        {
            for (int c = 0; c < getNumCols(); c++)
            {
                Location loc = new Location(r, c);
                if (get(loc) instanceof ThePlayer)
                    return (ThePlayer) get(loc);
            }
        }
        return null;
    }
}
