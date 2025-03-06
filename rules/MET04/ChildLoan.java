/**
 * Rule: MET04-J: Do not increase the accessibility of overridden or hidden methods
 * 
 * Description: Do not take a protected method in a child class, override it, and change the access modifier to public
 * 
 * @author Carl Ghess
 */

package MET04;

/**
 * The subclass of ParentLoan
 */
public class ChildLoan extends ParentLoan {

  /**
   * Basic constructor
   * 
   * @param principal the initial loan amount
   */
  public ChildLoan(int principal) {
    super(principal);
  }

  /** 
   * Returns the total amount due. Adds an additional $100 to the total amount
   * 
   * @return double
   */
  @Override
  protected double calculateInterestDue() {
    return (principal * interestRate) + 100;
  }
  
}
