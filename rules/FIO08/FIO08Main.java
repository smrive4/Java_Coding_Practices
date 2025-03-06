/**
 * Rule: FIO08-J: Distinguish between characters or bytes read from a stream and -1
 * 
 * Description: The value of read() from any InputStream or Reader subclass
 *              must be checked before casting the data to a char or byte.
 * 
 * @author Carl Ghess
 */

package FIO08;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Class for holding main method
 */
public class FIO08Main {
  public static void main(String[] args) {
    String fileName = "example.txt";
    String contents = "Hello -1 World!";

    // write contents to file
    try (FileWriter writer = new FileWriter(fileName)) {
      writer.write(contents);
    } catch (IOException e) {
      System.err.println("Error writing to file: " + e.getMessage());
    }


    // correctly read contents from file
    try(FileInputStream in = new FileInputStream(fileName)) {

      int inbuff;
      char data;
      // check to ensure end of stream is not reached
      while ((inbuff = in.read()) != -1) {
        // then cast inbuff to char
        data = (char) inbuff;
        System.out.print(data);
      }
    } catch (IOException e) {
      System.err.println("Error writing to file: " + e.getMessage());
    }

  }
}