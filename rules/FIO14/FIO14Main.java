/**
 * Rule: FIO14-J: Perform proper cleanup at program termination 
 * 
 * Description: Opened files must be closed before Runtime.exit() or Runtime.halt() methods are called.
 * 
 * @author Carl Ghess
 */
package FIO14;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Class for holding main method
 */
public class FIO14Main {
  public static void main(String[] args) throws FileNotFoundException {

    // Write the contents to the named file
    String fileName = "ex_FIO14.txt";
    String contents = "Perform proper cleanup at program termination";

    // create print stream
    FileOutputStream fStream = new FileOutputStream(fileName);
    BufferedOutputStream bfStream = new BufferedOutputStream(fStream);
    final PrintStream out = new PrintStream(bfStream);

    // write contents to file
    try {
      out.println(contents);
    } finally {
      // close the PrintStream before exiting
      out.close();
    }

    // exit the application after closing PrintStream
    Runtime.getRuntime().exit(1);
  }
}
