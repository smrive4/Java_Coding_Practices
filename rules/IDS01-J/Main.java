
import java.text.Normalizer;
import java.text.Normalizer.Form;

/**
 * Rule: IDS01-J. Normalize strings before validating them
 * 
 * Description: String should be normalize so that equal strings 
 *              have the same representation
 * 
 * @author Saul Rivera
 */

public class Main{
    /**
     * Main method
     */
    public static void main(String[] args) {
        String inputStr = "\u0073" + "\u0323" + "\u0307";

        // Normalize the String using normalization form NFC
        inputStr = Normalizer.normalize(inputStr, Form.NFC);

        // Validate Strings match
        String str = "\u1E69";
        if (inputStr.equals(str))
            System.out.println("Strings do match");
        else
            System.out.println("Strings do not match");
  
    }
}
