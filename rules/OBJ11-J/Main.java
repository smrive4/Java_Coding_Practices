/**
 * Rule Code: OBJ11-J
 * Rule Name: Be wary of letting constructors throw exceptions
 * Description: Avoids throwing exceptions in constructors, ensuring objects remain valid.
 *
 * @author Daniel Golladay
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Attempt to initialize Config with the file path that is provide
            Config config = new Config("config.txt");
            System.out.println("Config initialized: " + config.getFilePath());
        } catch (Exception e) {
            System.out.println("Failed to create Config: " + e.getMessage());
        }
    }
}

/**
 * Ensures file path is valid and avoids throwing exceptions inside constructors.
 */
class Config {
    private final String filePath;

    /**
     * If the file path is invalid it will use a default file path to avoid throwing exceptions
     * 
     * @param filePath 
     * @throws IllegalArgumentException 
     */
    public Config(String filePath) {
        if (filePath == null || filePath.isEmpty()) {
            handleError("Invalid file path");
            this.filePath = "default_config.txt"; //Safe value
        } else {
            this.filePath = filePath;
        }
    }

    /**
     * Prints error message instead of throwing an exception 
     * 
     * @param message 
     */
    private void handleError(String message) {
        System.out.println("Error: " + message);
    }

    /**
     * @return the file path of the configuration
     */
    public String getFilePath() {
        return filePath;
    }
}
