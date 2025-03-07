
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Calculator that calculates various formulas
 * 
 * @author Gavin Garcia
 * @author Daniel Golladay
 * @author Carl Ghess
 * @author Saul Rivera
 */

public class Calculator {

    // history of calculations
    static ArrayList<MyMath> history = null;
    // file path to get history
    static final String historyFileName = "history.ser";

  /**
   * Gets the history from the history.ser file
   * 
   * @return an array list of the user's history
   */
    @SuppressWarnings("unchecked")
    private static ArrayList<MyMath> retrieveHistory() {

        ArrayList<MyMath> deserializedObj = new ArrayList<>();

        // open history.ser and get the file
        try (FileInputStream inStream = new FileInputStream(historyFileName);
                ObjectInputStream objStream = new ObjectInputStream(inStream)) {

            // get the object and cast it
            deserializedObj = (ArrayList<MyMath>) objStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error: retrieving history: " + e.getMessage());
        }

        return deserializedObj;
    }

    /**
     * Main Driver
     */
    public static void main(String[] args) {

        // get the history first
        history = retrieveHistory();

        int menuOption;

        // display the menu and let user select option
        do {
            displayMenu();

            menuOption = getValidMenuOption();

            performSelectedOption(menuOption);
        } while (menuOption != 6);

        System.out.println("End of Program");

        // FIO14-J: Perform proper cleanup at program termination 
        Runtime.getRuntime().exit(1);
    }

    /**
     * Display Menu Options
     */
    private static void displayMenu() {
        System.out.println("\n--------------------");
        System.out.println("\tMENU");
        System.out.println("--------------------");
        System.out.println("1. Calculate area of a Circle.");
        System.out.println("2. Calculate area of a Rectangle.");
        System.out.println("3. Calculate volume of a Cylinder.");
        System.out.println("4. Calculate volume of a Rectangular Prism.");
        System.out.println("5. View history");
        System.out.println("6. Quit");
        System.out.println("--------------------");
        System.out.println("Enter an option (1-6): ");
    }

    /**
     * Get a Valid Menu Option
     * 
     * @return an integer representing a valid menu option
     */
    private static int getValidMenuOption() {
        Scanner scan = new Scanner(System.in);
        int menuOption;
        String trash;

        // Ensure menuOption is a integer
        while (!scan.hasNextInt()) {
            System.out.println("Option must be an number");
            trash = scan.nextLine();
            displayMenu();
        }
        menuOption = scan.nextInt();
        // Ensure menuOption falls within the valid range of options
        while (menuOption > 6 || menuOption < 1) {
            System.out.println("Option must be one of the listed options");
            displayMenu();
            // Ensure menuOption is a integer
            while (!scan.hasNextInt()) {
                System.out.println("Option must be an number");
                trash = scan.nextLine();
                displayMenu();
            }
            menuOption = scan.nextInt();
        }
        trash = scan.nextLine();

        return menuOption;
    }

    /**
     * Perform the option selected by the user.
     */
    private static void performSelectedOption(int menuOption) {
        switch (menuOption) {
            case 1:
                calcCircleArea();
                break;
            case 2:
                calcRectangleArea();
                break;
            case 3:
                calcCylinderVolume();
                break;
            case 4:
                calcRectPrismVolume();
                break;
            case 5:
                printOutHistory();
                break;
            case 6:
                saveHistory();
                break;
            default:
                break;
        }
    }

    /**
     * Perform calculating area of a Circle option
     */
    private static void calcCircleArea(){
        double radius;

        System.out.println("\nYou have selected to calculate the area of a Circle");
        System.out.print("Please input the radius of the circle: ");             
        radius = getValidDouble();
        
        Circle circle = new Circle(radius);
        history.add(circle);
        System.out.println("The area of the circle is: " + circle.getArea());
    }

    /**
     * Perform calculating area of a Rectangle Option
     */
    private static void calcRectangleArea(){
        double length;
        double width;

        System.out.println("You have selected to calculate the area of a Rectangle");
        System.out.print("Please input the length of the rectangle: ");
        length = getValidDouble();
        System.out.print("\nPlease input the width of the rectangle: ");
        width = getValidDouble();
        
        Rectangle rectangle = new Rectangle(length, width);
        history.add(rectangle);
        System.out.println("The area of the rectangle is: " + rectangle.getArea());
    }

    /**
     * Perform calculating volume of a Cylinder option
     */
    private static void calcCylinderVolume(){
        double radius;
        double height;

        System.out.println("You have selected to calculate the volume of a Cylinder");
        System.out.print("Please input the radius of the cylinder: ");
        radius = getValidDouble();
        System.out.print("\nPlease input the height of the cylinder: ");
        height = getValidDouble();
        
        Cylinder cylinder = new Cylinder(radius, height);
        history.add(cylinder);
        System.out.println("The volume of the cylinder is: " + cylinder.getVolume());
    }

    /**
     * Perform calculating volume of a Rectangular Prism option
     */
    private static void calcRectPrismVolume(){
        double height;
        double length;
        double width;

        System.out.println("You have selected to calculate the volume of a Rectangular Prism");
        System.out.print("Please input the height of the rectangular prism: ");
        height = getValidDouble();
        System.out.print("\nPlease input the length of the rectangular prism: ");
        length = getValidDouble();
        System.out.print("\nPlease input the width of the rectangular prism: ");
        width = getValidDouble();
        
        RectangularPrism rectangular_Prism = new RectangularPrism(height, width, length);
        history.add(rectangular_Prism);
        System.out.println("The volume of the rectangular prism is: " + rectangular_Prism.getVolume());
    }

    /**
     * Prints out History
     */
    private static void printOutHistory(){
        // print out history
        for (MyMath item : history) {
            System.out.println(item.getHistory());
            System.out.println("\n");
        }
    }
    
    /**
     * Get a valid double from the user
     */
    private static double getValidDouble(){
        Scanner scan = new Scanner(System.in);
        double validDouble;
        String trash;

        while (!scan.hasNextDouble()) { 
            System.out.println("Invalid input. Please enter a valid number: ");
            scan.nextLine();
        }                
        validDouble = scan.nextDouble();

        return validDouble;
    }

    /**
     * Save history to file
     */
    private static void saveHistory(){
        System.out.println("Saving...\n");
        // save history to file and then exit
        // serialize obj and write to file
        FileOutputStream outStream = null;
        ObjectOutputStream objStream = null;
        try {
            outStream = new FileOutputStream(historyFileName);
            objStream = new ObjectOutputStream(outStream);
            objStream.writeObject(history);

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());

        // FIO14-J: Perform proper cleanup at program termination 
        // Err04-J: Do not complete abruptly from a finally block
        } finally {
            try {
                // EXP01-J: Do not use null in a case where an object is required 
                if (objStream != null)
                    objStream.close();
            } catch (IOException e) {
                System.err.println("Error saving to file: " + e);
            }
        }
        System.out.println("Finished");
    }
}
