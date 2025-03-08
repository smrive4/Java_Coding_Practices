import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Rule Code: OBJ05-J
 * Rule Name: Do not return references to private mutable class members
 * Description: Prevents unintended modifications by external code.
 *
 * @author Daniel Golladay
 */
public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee();
        
        // Output the list of employee names
        System.out.println("Employees: " + emp.getEmployeeNames());
    }
}

/**
 * Employee class that stores a list of employee names.
 */
class Employee {
    private final List<String> employeeNames = new ArrayList<>();

    /**
     * Constructs an Employee object and adds some names to the employee list.
     */
    public Employee() {
        employeeNames.add("John");
        employeeNames.add("Jane");
    }

    /**
     * Returns an unmodifiable list of employee names to prevent modification from outside.
     * 
     * @return an unmodifiable list of employee names
     */
    public List<String> getEmployeeNames() {
        return Collections.unmodifiableList(employeeNames); // Prevents modification
    }
}
