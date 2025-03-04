
/**
 * Recommendation: OBJ52-J. Write garbage-collection-friendly code
 * 
 * Description: Programmer should write garbage-collection friendly code 
 *              by using short-lived immutable objects, avoiding large objects, and 
 *              not explicitly invoking the garbage collector.
 * 
 * @author Saul Rivera
 */

public class Main{
    /**
     * Main method
     */
    public static void main(String[] args) {
        helloWorld();
    }

    /**
     * Method to display "Hello World"
     */
    public static void helloWorld(){
        // str is a short lived immutable object, will cease to exist after method call ends
        String str = "Hello World";

        System.out.println(str);
    }
}
