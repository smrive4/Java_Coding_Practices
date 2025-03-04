
/**
 * Recommendation: ERR52-J. Avoid in-band error indicators
 * 
 * Description: Programmer shouldn’t return values from a method to indicate that an error has occurred.
 *              Instead an exception should be thrown.
 * 
 * @author Saul Rivera
 */

public class Main{
    /**
     * Main method
     */
    public static void main(String[] args) {
        double a = 5.0, b = 0.1, c;
        c = divide(a, b);
        System.out.println(c);
    }

    /**
     * Method to calculate the result of dividing two numbers
     * 
     * @param a dividend
     * @param b divisor
     * @return result of dividing a by b
     * @throws ArithmeticException if division by zero is attempted
     */
    public static double divide(double a, double b){
        if(b == 0.0)
        {
            throw new ArithmeticException("Can't divide by zero");
        }

        return a / b;
    }
}
