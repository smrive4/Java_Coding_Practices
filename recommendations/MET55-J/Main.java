
import java.util.ArrayList;

/**
 * Recommendation: MET55-J. Return an empty array or collection instead of a null value 
 *                 for methods that return an array or collection
 * 
 * Description: Methods should return an empty array or collection instead of null.
 * 
 * @author Saul Rivera
 */
public class Main{
    /**
     * Main method
     */
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        Nums nums1 = new Nums(numbers);
        ArrayList<Integer> evens = nums1.getEvens();

        System.out.println("Even numbers: " + evens.toString());
    }
}

/**
 * Class to hold a list of numbers
 */
class Nums{
    /** An Arraylist of numbers */
    private final ArrayList<Integer> nums;

    /**
     * Constructor
     * 
     * @param arr an array of integers
     */
    Nums(int[] arr){
        nums = new ArrayList<>();
        for(int i = 0; i < arr.length; i++)
        {
            nums.add(arr[i]);
        }
    }

    /**
     * Method to return a list of all even numbers
     * 
     * @return an ArrayList of all even numbers in nums
     */
    public ArrayList<Integer> getEvens(){
        ArrayList<Integer> evens = new ArrayList<>();

        for (Integer num : nums) {
            if (num % 2 == 0)
            {
                evens.add(num);
            }
        }

        return evens;
    }
}
