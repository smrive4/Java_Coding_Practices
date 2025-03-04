
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Rule: IDS11-J. Perform any string modifications before validation
 * 
 * Description: String modifications are to be done before validation.
 * 
 * @author Saul Rivera
 */

public class Main{
    /**
     * Main method
     */
    public static void main(String[] args) {
        // Input
        String date = "10-12-2006";

        // Modify input
        date = date.replaceAll("-", "/");

        Pattern pattern = Pattern.compile("\\d{2}/\\d{2}/\\d{4}"); // MM/DD/YYYY
        Matcher matcher = pattern.matcher(date);

        // Validate input
        if( matcher.find())
            System.out.println("Valid date format");
        else
            System.out.println("Invalid Date Format");
    }
}
