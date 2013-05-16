package FinalFantasy;

/**
 * Tests the KeyReader.
 * 
 * @author Shonee A. Freed-Doerr
 * @version 1.0.0
 */
public class ReaderRunner {
    public static void main(String[] args) {
        KeyReader kr = new KeyReader();
        System.out.println("Type in a letter");
        char c = kr.readOneKey();
        System.out.println(c);
    }
}
