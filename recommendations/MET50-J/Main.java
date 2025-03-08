/**
 * MET50-J
 * Demonstrates clear method overloading
 */
public class Main {

    /**
     * Adds two integer numbers.
     * 
     * @param a First integer
     * @param b Second integer
     * @return Sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Adds two double numbers.
     * 
     * @param a First double
     * @param b Second double
     * @return Sum of a and b
     */
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(1, 2));   // Calls the int version
        System.out.println(add(1.1, 2.1)); // Calls the double version
    }
}
