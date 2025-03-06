
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
    
            performMenuOption(menuOption);
        }while (menuOption != 7);

        System.out.println("End of Program");
    }

    /**
     * Display Menu Options
     */
    public static void displayMenu(){
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
    public static int getValidMenuOption(){
        Scanner scan = new Scanner(System.in);
        int menuOption;

        String trash;

        while(!scan.hasNextInt())
        {
            trash = scan.nextLine();
            displayMenu();
        }
        menuOption = scan.nextInt();
        trash = scan.nextLine();

        return menuOption;
    }

    /**
     * 
     */
    public static void performMenuOption(int menuOption){
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
        }        
    }
}
