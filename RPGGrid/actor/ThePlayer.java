package RPGGrid.actor;

import RPGGrid.grid.Grid;
import RPGGrid.grid.Location;
import RPGGrid.gui.*;

import java.awt.Color;

public class ThePlayer extends Actor
{
    private Actor standingOn;
    
    public void getInput(char i)
    {
        System.out.println("I got input");
    }
    
    public Actor getStandingOn()
    {
        return standingOn;
    }
    
    public void setStandingOn(Actor a)
    {
        standingOn = a;
    }
}