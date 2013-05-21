package FinalFantasy.worldObjects;

import RPGGrid.actor.*;
import RPGGrid.grid.*;

import java.util.ArrayList;
public class EmptySpaceDungeon extends WorldObject
{
    public void interact(ThePlayer p) {
        p.moveTo(getLocation());
    }
}