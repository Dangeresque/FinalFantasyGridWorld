package FinalFantasy;

import RPGGrid.actor.*;
import RPGGrid.grid.*;
import RPGGrid.gui.*;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

import java.awt.Color;

/**
 * This class runs a world that contains critters. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class RPGGridTester
{
    public static void main(String[] args)
    {
        BufferedImage img = null;

        try
        {
            img = ImageIO.read(new File("currentMap.gif"));
        } catch (IOException e) {
        }
        // Divide image Height/ width to get grid world size
        ActorWorld world = new ActorWorld(new BoundedGrid<Actor>(img.getHeight() / 16, img.getWidth() / 16 ));
        world.add(new Location(3, 3), new Rock());
        world.add(new Location(1, 5), new Flower(Color.RED));
        world.add(new Location(4, 4), new Critter());
        world.show();
    }

    /*
    public void zoomRight() {
        GridPanel.zoomIn();
        GridPanel.zoomIn();
    }
    */
}