
import java.math.BigInteger;

/**
 * Rule: EXP00-J. Do not ignore values returned by methods
 * 
 * Description: The user should not ignore any value returned by a method as they may contain the result
 *              of executing an operation.
 * 
 * @author Saul Rivera
 */

public class Main{
    /**
     * Main method
     */
    public static void main(String[] args) {
        BigInteger num = new BigInteger("100");

        // Output: 100
        System.out.println("Before dividing: " + num.toString()); 

        // Divide num by num and store new reference in num
        num = num.divide(num);

        // Output: 1
        System.out.println("After dividing: " + num.toString()); 
    }
}
