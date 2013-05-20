package RPGGrid;

import RPGGrid.actor.*;
import RPGGrid.grid.*;
import RPGGrid.gui.*;
import RPGGrid.world.*;
import FinalFantasy.worldObjects.*;

import java.util.ArrayList;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.Point;
import java.awt.Scrollbar;

import javax.swing.*;

import java.awt.Color;
/**
 * This class runs a world that contains critters. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class RPGGridTester
{
    RPGWorld world;
    public static void main(String[] args)
    {
        BufferedImage img = null;

        try
        {
            img = ImageIO.read(new File("currentMap.gif"));
        } catch (IOException e) {
        }
        // Divide image Height/ width to get grid world size
        RPGWorld world = new RPGWorld(new RPGGrid(img.getHeight() / 16, img.getWidth() / 16 ));

        ArrayList<Location> locs = new ArrayList<Location>();
        Grid g = world.getGrid();
        for(int r = 0; r < g.getNumRows(); r++)
        {
            for(int c = 0; c < g.getNumCols(); c++)
            {
                locs.add(new Location(r, c));
            }
        }
        //Door, GridItem, Obstacle, EmptySpaceTown, Person, EmptySpaceDungeon
        world.add(new Location(4, 4), new ThePlayer());
        world.add(locs.get(0), new Obstacle());
        world.add(locs.get(1), new Obstacle());
        world.add(locs.get(2), new Obstacle());
        world.add(locs.get(3), new Obstacle());
        world.add(locs.get(4), new Obstacle());
        world.add(locs.get(5), new Obstacle());
        world.add(locs.get(19), new Obstacle());
        world.add(locs.get(20), new Obstacle());
        world.add(locs.get(21), new Obstacle());
        world.add(locs.get(22), new Obstacle());
        world.add(locs.get(23), new Obstacle());
        world.add(locs.get(24), new Obstacle());
        world.add(locs.get(25), new Obstacle());
        world.add(locs.get(26), new GridItem());
        world.add(locs.get(31), new Obstacle());
        world.add(locs.get(43), new Obstacle());
        world.add(locs.get(47), new GridItem());
        world.add(locs.get(49), new Obstacle());
        world.add(locs.get(50), new Obstacle());
        world.add(locs.get(51), new GridItem());
        world.add(locs.get(56), new Obstacle());
        world.add(locs.get(68), new Obstacle());
        world.add(locs.get(74), new Obstacle());
        world.add(locs.get(75), new Obstacle());
        world.add(locs.get(76), new Obstacle());
        world.add(locs.get(81), new Obstacle());
        world.add(locs.get(82), new Obstacle());
        world.add(locs.get(83), new Obstacle());
        world.add(locs.get(84), new Obstacle());
        world.add(locs.get(85), new Obstacle());
        world.add(locs.get(86), new Obstacle());
        world.add(locs.get(87), new Obstacle());
        world.add(locs.get(88), new Obstacle());
        world.add(locs.get(89), new Obstacle());
        world.add(locs.get(90), new Obstacle());
        world.add(locs.get(91), new Obstacle());
        world.add(locs.get(92), new Obstacle());
        world.add(locs.get(93), new Obstacle());
        world.add(locs.get(99), new Obstacle());
        world.add(locs.get(100), new Obstacle());
        world.add(locs.get(124), new Obstacle());
        world.add(locs.get(125), new Obstacle());
        world.add(locs.get(126), new Obstacle());
        world.add(locs.get(127), new Obstacle());
        world.add(locs.get(131), new Obstacle());
        world.add(locs.get(132), new Obstacle());
        world.add(locs.get(133), new Obstacle());
        world.add(locs.get(134), new Obstacle());
        world.add(locs.get(135), new Obstacle());
        world.add(locs.get(136), new Obstacle());
        world.add(locs.get(137), new Obstacle());
        world.add(locs.get(138), new Obstacle());
        world.add(locs.get(139), new Obstacle());
        world.add(locs.get(140), new Obstacle());
        world.add(locs.get(141), new Obstacle());
        world.add(locs.get(142), new Obstacle());
        world.add(locs.get(143), new Obstacle());
        world.add(locs.get(144), new Obstacle());



        world.show();
    }

    //world.getJFrame().getDisplay().moveLocation(15, 15);
}