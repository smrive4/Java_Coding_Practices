/**
 * EXP01-J: Do not use null in a case where an object is required 
 * 
 * Description:	In situations which a method is called or a field is modified, do not use a null object
 * 
 * @author Carl Ghess
 */

package EXP01;

/**
 * A class to represent a student
 */
public class Student {
  int studentID;
  String studentName;

  /**
   * Basic constructor
   * 
   * @param studentID the student's ID
   * @param studentName the name of the student
   */
  public Student(int studentID, String studentName) {
    this.studentID = studentID;
    this.studentName = studentName;
  }

  /**
   * Returns the name of the student
   * 
   * @return String
   */
  public String getName() {
    return studentName;
  }

}
