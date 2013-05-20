package RPGGrid;

import RPGGrid.actor.*;
import RPGGrid.grid.*;
import RPGGrid.gui.*;
import RPGGrid.world.*;

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
        world.add(new Location(4, 4), new ThePlayer());
        world.show();
        
        world.getJFrame().getDisplay().moveLocation(15, 15);
        //WorldFrame temp = (WorldFrame) world.getJFrame();
        //temp.getDisplay().zoomIn();
        //temp.getDisplay().zoomIn();
        // temp.getPseudo().setViewPosition(temp.getPseudo().getPanCenterPoint());
        /*temp.reshape(100, 100, 800, 600);
        // Scrollbar s = new Scrollbar();
        // s.setBounds(0, 0, 800, 600);
        JScrollBar vertS = temp.getPseudo().getScroll().getVerticalScrollBar();
        vertS.setValue(10);
        temp.getPseudo().getScroll().setVerticalScrollBar(vertS);
        vertS.updateUI();

        JViewport vp = getEnclosingViewport();
         */
    }
}