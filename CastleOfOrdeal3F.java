import RPGGrid.actor.*;
import RPGGrid.grid.*;
import RPGGrid.gui.*;
import RPGGrid.world.*;
import RPGGrid.input.*;

import FinalFantasy.*;
import FinalFantasy.worldObjects.*;

import java.util.ArrayList;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.io.IOException;

/**
 * This is the driver that runs the level Castle Of Ordeal (third floor) from
 * Final Fantasy 1.
 * @author Sean MacLane
 */
public class CastleOfOrdeal3F
{
    private RPGWorld world;
    private static File f;
    private static SoundPlayer s;

    /**
     * This sets up everything needed for a new game (a grid, a world, 
     * a .wav file, a SoundPlayer, the locations of objects in the grid, 
     * the player, the key listner, and the intial position of the "camera" 
     * looking at the grid.
     */
    public static void main(String[] args)
    {
        double ran = Math.random();
        if(ran < .3)
        {
            f = new File("dungeon.wav");
            s = new SoundPlayer(f);
        } else if (ran > .66)
        {
            f = new File("angel.wav");
            s = new SoundPlayer(f);
        } else {
            f = new File("battle.wav");
            s = new SoundPlayer(f);
        }

        BufferedImage img = null;

        try
        {
            img = ImageIO.read(new File("currentMap.gif"));
        } catch (IOException e) {}
        // Divide image Height/ width by 16 to get grid size
        RPGWorld world = new RPGWorld(new RPGGrid(img.getHeight() / 16, img.getWidth() / 16 ), s);

        ArrayList<Location> locs = new ArrayList<Location>();
        Grid g = world.getGrid();
        for(int r = 0; r < g.getNumRows(); r++)
        {
            for(int c = 0; c < g.getNumCols(); c++)
            {
                locs.add(new Location(r, c));
                world.add(new Location(r, c), new EmptySpaceDungeon());
            }
        }

        //Door, GridItem, Obstacle, EmptySpaceTown, Person, EmptySpaceDungeon, Portal

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
        world.add(locs.get(26), new GridItem(new Armor(4)));
        world.add(locs.get(31), new Obstacle());
        world.add(locs.get(43), new Obstacle());
        world.add(locs.get(47), new GridItem(new Weapon(1)));
        world.add(locs.get(49), new Obstacle());
        world.add(locs.get(50), new Obstacle());
        world.add(locs.get(51), new GridItem(new Armor(3)));
        world.add(locs.get(56), new Obstacle());
        world.add(locs.get(68), new Obstacle());
        world.add(locs.get(74), new Obstacle());
        world.add(locs.get(75), new Obstacle());
        world.add(locs.get(76), new GridItem(new Weapon(2)));
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
        world.add(locs.get(145), new Door("Ordeal0"));
        world.add(locs.get(146), new Obstacle());
        world.add(locs.get(147), new Obstacle());
        world.add(locs.get(148), new Obstacle());
        world.add(locs.get(149), new Obstacle());
        world.add(locs.get(152), new Obstacle());
        world.add(locs.get(156), new Obstacle());
        world.add(locs.get(169), new Obstacle());
        world.add(locs.get(171), new Obstacle());
        world.add(locs.get(177), new Obstacle());
        world.add(locs.get(181), new Obstacle());
        world.add(locs.get(194), new Obstacle());
        world.add(locs.get(196), new Obstacle());
        world.add(locs.get(202), new Obstacle());
        world.add(locs.get(206), new Obstacle());
        world.add(locs.get(219), new Obstacle());
        world.add(locs.get(221), new Obstacle());
        world.add(locs.get(227), new Obstacle());
        world.add(locs.get(231), new Obstacle());
        world.add(locs.get(244), new Obstacle());
        world.add(locs.get(246), new Obstacle());
        world.add(locs.get(252), new Obstacle());
        world.add(locs.get(256), new Obstacle());
        world.add(locs.get(269), new Obstacle());
        world.add(locs.get(271), new Obstacle());
        world.add(locs.get(277), new Obstacle());
        world.add(locs.get(281), new Obstacle());
        world.add(locs.get(294), new Obstacle());
        world.add(locs.get(296), new Obstacle());
        world.add(locs.get(302), new Obstacle());
        world.add(locs.get(306), new Obstacle());
        world.add(locs.get(319), new Obstacle());
        world.add(locs.get(321), new Obstacle());
        world.add(locs.get(327), new Obstacle());
        world.add(locs.get(331), new Obstacle());
        world.add(locs.get(344), new Obstacle());
        world.add(locs.get(346), new Obstacle());
        world.add(locs.get(352), new Obstacle());
        world.add(locs.get(356), new Obstacle());
        world.add(locs.get(369), new Obstacle());
        world.add(locs.get(371), new Obstacle());
        world.add(locs.get(377), new Obstacle());
        world.add(locs.get(381), new Obstacle());
        world.add(locs.get(389), new Obstacle());
        world.add(locs.get(390), new Obstacle());
        world.add(locs.get(391), new Obstacle());
        world.add(locs.get(392), new Obstacle());
        world.add(locs.get(393), new Obstacle());
        world.add(locs.get(394), new Obstacle());
        world.add(locs.get(396), new Obstacle());
        world.add(locs.get(402), new Obstacle());
        world.add(locs.get(406), new Obstacle());
        world.add(locs.get(413), new Obstacle());
        world.add(locs.get(419), new Obstacle());
        world.add(locs.get(421), new Obstacle());
        world.add(locs.get(427), new Obstacle());
        world.add(locs.get(431), new Obstacle());
        world.add(locs.get(438), new Obstacle());
        world.add(locs.get(444), new Obstacle());
        world.add(locs.get(446), new Obstacle());
        world.add(locs.get(452), new Obstacle());
        world.add(locs.get(456), new Obstacle());
        world.add(locs.get(463), new Obstacle());
        world.add(locs.get(469), new Obstacle());
        world.add(locs.get(471), new Obstacle());
        world.add(locs.get(475), new Obstacle());
        world.add(locs.get(476), new Obstacle());
        world.add(locs.get(477), new Obstacle());
        world.add(locs.get(481), new Obstacle());
        world.add(locs.get(482), new Obstacle());
        world.add(locs.get(483), new Obstacle());
        world.add(locs.get(484), new Obstacle());
        world.add(locs.get(485), new Obstacle());
        world.add(locs.get(486), new Obstacle());
        world.add(locs.get(487), new Obstacle());
        world.add(locs.get(488), new Obstacle());
        world.add(locs.get(494), new Obstacle());
        world.add(locs.get(497), new Obstacle());
        world.add(locs.get(498), new Obstacle());
        world.add(locs.get(499), new Obstacle());
        world.add(locs.get(500), new Obstacle());
        world.add(locs.get(519), new Obstacle());
        world.add(locs.get(524), new Obstacle());
        world.add(locs.get(525), new Obstacle());
        world.add(locs.get(531), new Obstacle());
        world.add(locs.get(532), new Obstacle());
        world.add(locs.get(533), new Obstacle());
        world.add(locs.get(534), new Obstacle());
        world.add(locs.get(535), new Obstacle());
        world.add(locs.get(536), new Obstacle());
        world.add(locs.get(537), new Obstacle());
        world.add(locs.get(538), new Obstacle());
        world.add(locs.get(539), new Obstacle());
        world.add(locs.get(540), new Obstacle());
        world.add(locs.get(541), new Obstacle());
        world.add(locs.get(542), new Obstacle());
        world.add(locs.get(543), new Obstacle());
        world.add(locs.get(544), new Obstacle());
        world.add(locs.get(549), new Obstacle());
        world.add(locs.get(550), new Obstacle());
        world.add(locs.get(551), new GridItem(new Key("Ordeal0")));
        world.add(locs.get(552), new GridItem(new Armor(2)));
        world.add(locs.get(553), new GridItem(new Weapon(5)));
        world.add(locs.get(554), new GridItem(new Armor(1)));
        world.add(locs.get(556), new Obstacle());
        world.add(locs.get(569), new Obstacle());
        world.add(locs.get(572), new Portal(null));
        world.add(locs.get(574), new Obstacle());
        world.add(locs.get(575), new Obstacle());
        world.add(locs.get(581), new Obstacle());
        world.add(locs.get(594), new Obstacle());
        world.add(locs.get(599), new Obstacle());
        world.add(locs.get(600), new Obstacle());
        world.add(locs.get(601), new Obstacle());
        world.add(locs.get(602), new Obstacle());
        world.add(locs.get(603), new Obstacle());
        world.add(locs.get(604), new Obstacle());
        world.add(locs.get(605), new Obstacle());
        world.add(locs.get(619), new Obstacle());
        world.add(locs.get(620), new Obstacle());
        world.add(locs.get(621), new Obstacle());
        world.add(locs.get(622), new Obstacle());
        world.add(locs.get(623), new Obstacle());
        world.add(locs.get(624), new Obstacle());

        Location playerLoc = new Location(19, 18);
        ThePlayer p = new ThePlayer(world, new FFCharacter());
        world.add(playerLoc, p);

        world.show();

        RPGListner mover = new RPGListner(world);
        world.getJFrame().getDisplay().moveLocation(playerLoc.getRow(), playerLoc.getCol());

        s.play();
    }
}