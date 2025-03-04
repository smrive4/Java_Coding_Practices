
import java.util.Arrays;

/**
 * Rule: EXP02-J. Do not use the Object.equals() method to compare two arrays
 * 
 * Description: Using the Object.equals() method shouldn’t be used to compare the elements of two arrays
 *              instead Arrays.equals() should be used to check if the arrrays 
 *              are equal in content.
 * 
 * @author Saul Rivera
 */

public class Main{
    /**
     * Main method
     */
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {5,1,2,3,4};

        // Check arrays for content equailty
        if(Arrays.equals(arr1, arr2))
            System.out.println("Arrays are equal in content");
        else
            System.out.println("Arrays are not equal in content");
    }
}
