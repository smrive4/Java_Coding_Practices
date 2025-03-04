
import java.util.ArrayList;
import java.util.Arrays;


/**
 * Rule: EXP04-J. Do not pass arguments to certain Java Collections Framework methods 
 *                that are a different type than the collection parameter type.
 * 
 * Description: Some Java collections methods take in an object as their arguments. 
 *              As such it’s important to ensure any arguments pass are of the same type as the collection parameter type.
 * 
 * @author Saul Rivera
 */

public class Main{
    /**
     * Main method
     */
    public static void main(String[] args) {
        ArrayList<String> alphabet = new ArrayList<>();
        alphabet.add(String.valueOf('A'));
        alphabet.add(String.valueOf('B'));
        alphabet.add(String.valueOf('C'));

        System.out.println(Arrays.toString(alphabet.toArray()));

        System.out.println("Contains Letter B: " + alphabet.contains(String.valueOf('B')));
    }    
}

