/**
 * Rule Code: OBJ04-J
 * Rule Name: Provide mutable classes with copy functionality to safely allow passing instances to untrusted code
 * Description: Prevents exposing mutable objects directly by creating safe copies.
 *
 * @author Daniel Golladay
 */
public class Main {
    public static void main(String[] args) {
        Person original = new Person("Daniel", 18);
        
        // Creates a safe copy
        Person copy = new Person(original); 

        System.out.println("Original: " + original.getName() + ", Age: " + original.getAge());
        System.out.println("Copy: " + copy.getName() + ", Age: " + copy.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) { 
        this.name = other.name;
        this.age = other.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
