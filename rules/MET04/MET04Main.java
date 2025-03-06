/**
 * Rule: MET04-J: Do not increase the accessibility of overridden or hidden methods
 * 
 * Description: Do not take a protected method in a child class, override it, and change the access modifier to public
 * 
 * @author Carl Ghess
 */

package MET04;

/**
 * Class for holding main method
 */
public class MET04Main {
  public static void main(String[] args) {
    
    // create the child class and print the total
    ChildLoan childClass = new ChildLoan(500);

    double total = childClass.getTotalDue();
    System.out.println("The total due is " + total);
  }
}
