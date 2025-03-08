/**
 * Rule Code: OBJ08-J
 * Rule Name: Do not expose private members of an outer class from within a nested class
 * Description: Ensures private fields remain encapsulated within the outer class.
 *
 * @author Daniel Golladay
 */
public class Main {
    public static void main(String[] args) {
        // Create an instance of Outer with a secret number
        Outer outer = new Outer(42);
        
        // Print the secret number using the outer class method
        outer.printSecret();
    }
}

/**
 * Outer class contains a private field - inner class can access the outer fields but 
 * does not expose them.
 */
class Outer {
    //Outer field which is private
    private int secretNumber; 

    /**
     * @param secretNumber number to be stored in the outer class
     */
    public Outer(int secretNumber) {
        this.secretNumber = secretNumber;
    }

    /**
     * Gives inner class acces to outer field
     */
    public void printSecret() {
        Inner inner = new Inner();
        inner.display(); 
    }

    /**
     * Inner class
     */
    private class Inner {
        /**
         * Display secret from outer class
         * Avoids exposing the function directly
         */
        public void display() {
            System.out.println("Secret Number: " + secretNumber); 
            
        }
    }
}
