/**
 * Rule: SER05-J. Do not serialize instances of inner classes
 * 
 * Description: When using java serialization, it’s important that only the outer class implements Serializeable. 
 *              Any inner class cannot implement serializable, unless that inner class is static. 
 * 
 * @author Carl Ghess
 */

package SER05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Class for holding main method
 */
public class SER05Main {

  public static void main(String[] args) {

    // create new nested class and file to store object
    NestedClass obj = new NestedClass(5, 30);
    String fileName = "ex_SER05.ser";

    // serialize obj and write to file
    try (FileOutputStream outStream = new FileOutputStream(fileName);
        ObjectOutputStream objStream = new ObjectOutputStream(outStream)) {

      objStream.writeObject(obj);

    } catch (IOException e) {
      System.err.println("Error: " + e.getMessage());
    }

    // now deserialize and print object out
    try (FileInputStream inStream = new FileInputStream(fileName);
        ObjectInputStream objStream = new ObjectInputStream(inStream)) {

      // get the object
      NestedClass deserializedObj = (NestedClass) objStream.readObject();

      // print value from inner class
      int val = deserializedObj.getInnerClassVal();
      System.out.println("The value in the inner class is " + val);

    } catch (IOException | ClassNotFoundException e) {
      System.err.println("Error: " + e.getMessage());
    }
  }
}
