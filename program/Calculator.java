
import java.util.Scanner;

/**
 * Calculator that calculates various formulas
 * 
 * @author Gavin Garcia
 * @author Daniel Golladay
 * @author Carl Ghess
 * @author Saul Rivera 
 */

public class Calculator{
    /**
     * Main Driver
     */
    public static void main(String[] args) {
        int menuOption;

        do{
            displayMenu();
            
            menuOption = getValidMenuOption();
    
            performSelectedOption(menuOption);
        }while (menuOption != 5);

        System.out.println("End of Program");
    }

    /**
     * Display Menu Options
     */
    private static void displayMenu(){
        System.out.println("\n--------------------");
        System.out.println("\tMENU");
        System.out.println("--------------------");
        System.out.println("1. Calculate area of a Circle.");
        System.out.println("2. Calculate area of a Rectangle.");
        System.out.println("3. Calculate volume of a Cylinder.");
        System.out.println("4. Calculate volume of a Rectangular Prism.");
        System.out.println("5. Quit");
        System.out.println("--------------------");
        System.out.println("Enter option (#-#): ");
    }

    /**
     * Get a Valid Menu Option
     * 
     * @return an integer representing a valid menu option
     */
    private static int getValidMenuOption(){
        Scanner scan = new Scanner(System.in);
        int menuOption;
        String trash;

        // Ensure menuOption is a integer
        while(!scan.hasNextInt())
        {
            System.out.println("Option must be an number");
            trash = scan.nextLine();
            displayMenu();
        }
        menuOption = scan.nextInt();
        // Ensure menuOption falls within the valid range of options
        while(menuOption > 5 || menuOption < 1)
        {
            System.out.println("Option must be one of the listed options");
            displayMenu();
            // Ensure menuOption is a integer
            while(!scan.hasNextInt())
            {
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
    private static void performSelectedOption(int menuOption){
        switch(menuOption){
            case 1:
                // perform menu option operation
                System.out.println("You have selected to calculate the area of a Circle");
                break;
            case 2:
                // perform menu option operation
                System.out.println("You have selected to calculate the area of a Rectangle");

                break;
            case 3:
                // perform menu option operation
                System.out.println("You have selected to calculate the volume of a Cylinder");

                break;
            case 4:
                // perform menu option operation
                System.out.println("You have selected to calculate the volume of a Rectangular Prism");
                
                break;
            default:
                break;
        }        
    }
}
