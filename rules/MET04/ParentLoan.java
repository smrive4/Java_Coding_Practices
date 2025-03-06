/**
 * Rule: MET04-J: Do not increase the accessibility of overridden or hidden methods
 * 
 * Description: Do not take a protected method in a child class, override it, and change the access modifier to public
 * 
 * @author Carl Ghess
 */

package MET04;

/**
 * A parent loan superclass
 */
public class ParentLoan {
  
  double interestRate = 0.05;

  int principal;

  /**
   * Basic constructor
   * 
   * @param principal the initial loan amount
   */
  public ParentLoan(int principal) {
    this.principal = principal;
  }

  
  /** 
   * returns the total interest due
   * 
   * @return double
   */
  protected double calculateInterestDue() {
    return principal * interestRate;
  }

  
  /** 
   * Returns the total amount due
   * 
   * @return double
   */
  public double getTotalDue() {
    return principal + calculateInterestDue();
  }
}
