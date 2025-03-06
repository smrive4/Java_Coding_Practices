/**
 * ERR04-J: Do not complete abruptly from a finally block
 * 
 * Description:	Do not use continue, return, break, or throw within a finally block.
 * 
 * @author Carl Ghess
 */

package ERR04;

/**
 * Class for holding main method
 */
public class ERR04Main {
  public static void main(String[] args) {
    
    // get  number from user
    System.out.println("Enter an integer");
    String userInput = System.console().readLine();

    // try to cast to an int
    int val = 0;
    try {
      val = Integer.parseInt(userInput);

    } catch(NumberFormatException e) {

      System.err.println("Invalid user input");

    } finally {
      // this prints out the default value if user input invalid
      System.out.println("Your value is " + val);
    }
  }
}
