/**
 * DCL51-J
 * Demonstrates correct naming of classes compared to loacal variables
 */
public class Main {
    
    // Class field ID
    private int id;

    /**
     * Sets the ID using a clearly distinct parameter name to avoid shadowing.
     * 
     * @param newId The new ID to be set
     */
    public void setId(int newId) {
        this.id = newId; 
    }

    /**
     * Gets the ID.
     * 
     * @return The current ID value
     */
    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.setId(309);
        System.out.println("ID: " + obj.getId()); 
    }
}
