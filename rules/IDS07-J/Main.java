
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Rule: IDS07-J. Sanitize untrusted data passed to the Runtime.exec() method
 * 
 * Description: Arguments passed to the runtime.exec() method should be sanitized by 
 *              preventing certain characters, restricting the commands the user has access 
 *              to or by avoiding the use of the runtime.exec() method.
 * 
 * @author Saul Rivera
 */

public class Main{
    /**
     * Main method
     */
    public static void main(String[] args) throws Exception{
        String input = "text.txt";

        Pattern pattern = Pattern.compile("^[0-9A-Za-z]+.txt");
        Matcher matcher = pattern.matcher(input);

        // Validate input is a .txt file
        if(matcher.find())
        {
            Process proc = Runtime.getRuntime().exec(new String[] {"sh", "-c", "touch " + input});
            proc.waitFor();
        }
        else
        {
            System.out.println("Invalid file name");
        }
    }
}
