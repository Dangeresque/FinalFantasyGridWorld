package RPGGrid.input;

import java.io.*;
/**
 * Reads user input.
 * 
 * @author Shonee A. Freed-Doerr
 * @version 1.0.0
 */
public class KeyReader
{
    // instance variables
    private InputStreamReader reader;
    private BufferedReader buffReader;
    /**
     * Constructor for objects of class KeyReader
     */
    public KeyReader()
    {
        // initialise instance variables
        reader = new InputStreamReader(System.in);
        buffReader = new BufferedReader(reader);
    }
    public char readOneKey() {
        try {
            return (char) (reader.read());
        } catch (IOException ioe) {
            System.out.println("Unexpected error in input!");
        }
        return '0';
    }
}
