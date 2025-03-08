import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Rule Code: OBJ13-J
 * Rule Name: Do not expose references to mutable objects to client code
 * Description: Prevents the exposure of mutable objects directly to client code to avoid unintended modifications.
 *
 * @author Daniel Golladay
 */
public class Main {
    public static void main(String[] args) {
        // Accessing a safe copy of the immutable objects.
        List<Example> safeList = DataStore.getSomethings();
        System.out.println("Safe List: " + safeList);
    }
}

/**
 * Provides access to a list of example objects
 * Ensures that the original data can not be directly modified
 */
class DataStore {

    // Private array of immutable Example objects
    private static final Example[] THE_THINGS = { new Example("Item1"), new Example("Item2") };

    /**
     * Returns a safe copy of the array -- unmodifiable
     * 
     * @return 
     */
    public static List<Example> getSomethings() {
        return Collections.unmodifiableList(Arrays.asList(THE_THINGS.clone())); // Clone the array to avoid exposure of mutable references
    }
}

/**
 * Immutable class for demonstating OBJ13-J
 */
class Example {
    private final String name;

    public Example(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
