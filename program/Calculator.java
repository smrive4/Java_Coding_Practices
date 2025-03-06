
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
        }while (menuOption != 7);

        System.out.println("End of Program");
    }

    /**
     * Display Menu Options
     */
    private static void displayMenu(){
        System.out.println("\n--------------------");
        System.out.println("\tMENU");
        System.out.println("--------------------");
        System.out.println("1. ");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("7. Quit");
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
        while(menuOption > 7 || menuOption < 1)
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
                break;
            case 2:
                // perform menu option operation
                break;
            case 3:
                // perform menu option operation
                break;
            case 4:
                // perform menu option operation
                break;
            case 5:
                // perform menu option operation
                break;
            default:
                break;
        }        
    }
}
