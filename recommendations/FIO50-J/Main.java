
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 * Recommendation: FIO50-J. Do not make assumptions about file creation
 * 
 * Description: When creating a file, the program should handle events such as 
 *              creating a file that already exists.
 * 
 * @author Saul Rivera
 */

public class Main{
    /**
     * Main method
     */
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = scan.nextLine();
        String text = "Hello world";

        // Create new File, fails if file already exists
        try(OutputStream out = Files.newOutputStream(Paths.get(fileName), StandardOpenOption.CREATE_NEW)) {
            out.write(text.getBytes());

            out.close();
        } catch (IOException ex) {
            // Handle Error if file already exists
            System.out.println("ERROR: File Name already exists");
        }
    }
}
