package FinalFantasy.worldObjects;
import java.util.*;
public class Koy
{
    private static Scanner s = new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Type in a line: ");
        String line = s.nextLine();
        System.out.print("Type in a int: ");
        int inty = s.nextInt();
        System.out.println(line + inty);
    }
}