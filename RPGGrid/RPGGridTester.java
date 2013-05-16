package RPGGrid;

import RPGGrid.actor.*;
import RPGGrid.grid.*;
import RPGGrid.gui.*;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.Point;
<<<<<<< HEAD

=======
import java.awt.Scrollbar;

import javax.swing.*;

>>>>>>> origin/Sean-Test-Branch
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
        RPGWorld world = new RPGWorld(new BoundedGrid<Actor>(img.getHeight() / 16, img.getWidth() / 16 ));
        world.add(new Location(4, 4), new Actor());
        world.show();

        WorldFrame temp = (WorldFrame) world.getJFrame();
        temp.getDisplay().zoomIn();
        temp.getDisplay().zoomIn();
<<<<<<< HEAD
        //temp.getPseudo().setViewPosition(new Point(3000, 3000));
=======
        /*temp.getPseudo().setViewPosition(new Point(500, 500));
        //temp.reshape(100, 100, 800, 600);
        // Scrollbar s = new Scrollbar();
        // s.setBounds(0, 0, 800, 600);
        JScrollBar vertS = temp.getPseudo().getScroll().getVerticalScrollBar();
        vertS.setValue(10);
        temp.getPseudo().getScroll().setVerticalScrollBar(vertS);
        vertS.updateUI();

        JViewport vp = getEnclosingViewport();
         */
>>>>>>> origin/Sean-Test-Branch
    }
}