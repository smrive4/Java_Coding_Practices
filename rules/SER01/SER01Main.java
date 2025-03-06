/**
 * Rule: SER01-J: Do not deviate from the proper signatures of serialization methods. 
 * 
 * Description: An object that implements serializable must implement the exact same method signatures.
 * 
 * @author Carl Ghess
 */

package SER01;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Class for holding main method
 */
public class SER01Main {

  public static void main(String[] args) {

      // create object and file name to write to
      ExampleObj obj = new ExampleObj(5, 30, 40);
      String fileName = "ex_SER01.ser";

      //serialize obj and write to file
      try(FileOutputStream outStream = new FileOutputStream(fileName);
          ObjectOutputStream objStream = new ObjectOutputStream(outStream)) {

        objStream.writeObject(obj);

      } catch(IOException e) {

        System.err.println("Error: " + e.getMessage());
      }

      // now deserialize and print object out
      try(FileInputStream inStream = new FileInputStream(fileName);
          ObjectInputStream objStream = new ObjectInputStream(inStream)) {

        // get the object
        ExampleObj deserializedObj = (ExampleObj) objStream.readObject();

        // print values
        System.out.println("Num 1 is " + deserializedObj.num1);
        System.out.println("Num 2 is " + deserializedObj.num2);
        System.out.println("Num 3 is " + deserializedObj.num3);

      } catch (IOException | ClassNotFoundException e) {

        System.err.println("Error: " + e.getMessage());
      }

  }
}
