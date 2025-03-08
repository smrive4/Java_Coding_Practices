import java.io.FileWriter;
import java.io.IOException;
import java.util.Base64;

/**
 * FIO52-J
 * Demonstrates how to store sensitive data with encryption.
 */
public class Main {
    public static void main(String[] args) {
        String sensitiveData = "UserPassword123";

        // EEncrypt the data with Base64 encoding before it is stored
        String encryptedData = Base64.getEncoder().encodeToString(sensitiveData.getBytes());

        try (FileWriter writer = new FileWriter("sensitiveData.txt")) {
            writer.write(encryptedData); // Store the encrypted data 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
