/**
 * Rule Code: OBJ07-J
 * Rule Name: Sensitive classes must not let themselves be copied
 * Description: Prevents cloning or copying of sensitive objects.
 *
 * @author Daniel Golladay
 */
public class Main {
    public static void main(String[] args) {
        // Store secret in the object
        SecureData secure = new SecureData("Secret");
        
        // get the secret
        System.out.println("Data: " + secure.getData());
    }
}

/**
 * Demonstrating that sensitive data should not be copied.  Final so that no subclasses, 
 * copy constructor throws an exception
 */
final class SecureData {
    private final String data;

    /**
     * Constructor to initialize the sensitive data that is passed
     * 
     * @param data is the sensitive data to be stored
     */
    public SecureData(String data) {
        this.data = data;
    }

    /**
     * Private and prevents copying
     * Throws exception if use
     * 
     * @param other What would be copied 
     * @throws UnsupportedOperationException if called to prevent copying
     */
    private SecureData(SecureData other) { // Prevents copying
        throw new UnsupportedOperationException("Copying is not allowed. Per OBJ07-J");
    }

    /**
     * Gets the secret data
     * 
     * @return the sensitive data as a string
     */
    public String getData() {
        return data;
    }
}
