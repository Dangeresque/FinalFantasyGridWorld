package RPGGrid.grid;

import RPGGrid.actor.*;

public class RPGGrid extends BoundedGrid
{
    private Object[][] occupantArray;

    public RPGGrid(int rows, int cols)
    {
        super(rows, cols);
    }

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
