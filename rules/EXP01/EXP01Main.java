/**
 * EXP01-J: Do not use null in a case where an object is required 
 * 
 * Description:	In situations which a method is called or a field is modified, do not use a null object
 * 
 * @author Carl Ghess
 */

package EXP01;

import java.util.ArrayList;

/**
 * Class for holding main method
 */
public class EXP01Main {
  
  /** 
   * Checks if Student object is null
   * 
   * @param student the student object to null check
   * @return boolean
   */
  public static boolean isNull(Student student) {
    if (student == null)
      return true;
    return false;
  }

  
  /** 
   * Prints out the name of the Student object
   * 
   * @param student The student whose name is printed
   */
  public static void printName(Student student) {
    String name = student.getName();
    System.out.println("Student name is " + name);
  }


  public static void main(String[] args) {

    //create students and add them to the ArrayList
    Student ex01 = new Student(9912765, "John Smith");
    Student ex02 = null;
    Student ex03 = new Student(762434, "Caleb Jones");

    ArrayList<Student> studentList = new ArrayList<Student>();

    studentList.add(ex01);
    studentList.add(ex02);
    studentList.add(ex03);

    // print student names if they're not null
    for (Student student : studentList) {
      if (!isNull(student)) {
        printName(student);
      }
    }

  }
}
