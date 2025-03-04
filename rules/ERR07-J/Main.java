
import java.util.Scanner;

/**
 * Rule: ERR07-J. Do not throw RuntimeException, Exception, or Throwable
 * 
 * Description: RuntimeException, Exception, or Throwable should not be thrown by a method
 *              instead a specfic subclass should be used. 
 * 
 * @author Saul Rivera
 */

public class Main{
    /**
     * Main method
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value of n: ");
        int n = scan.nextInt();

        int result = fibonacci(n);
        System.out.println("Result: " + result);
    }

    /**
     * Method to return the value of the nth term of the fibonacci sequence
     * 
     * @param i the nth term of the fibonacci sequence
     * @return value of the nth term of the fibonacci sequence
     * @throws IllegalArgumentException if i is less than 0
     */
    private static int fibonacci(int i)
    {
        if(i < 0)
            throw new IllegalArgumentException();

        if (i == 0)
            return 0;
        if (i == 1)
            return 1; 

        return fibonacci(i - 2) + fibonacci(i - 1);
    }
}