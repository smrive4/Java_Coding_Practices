/**
 * Rule: SER01-J: Do not deviate from the proper signatures of serialization methods. 
 * 
 * Description: An object that implements serializable must implement the exact same method signatures.
 * 
 * @author Carl Ghess
 */

package SER01;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * An example of a class which implements Serializable and overrides the methods with the correct signatures
 */
public class ExampleObj implements Serializable {
  
  int num1, num2, num3;

  /**
   * Basic constructor for ExampleObj
   * 
   * @param num1 any integer
   * @param num2 any integer
   * @param num3 any integer
   */
    public ExampleObj(int num1, int num2, int num3) {
      this.num1 = num1;
      this.num2 = num2;
      this.num3 = num3;
    }
    
  /**
   * Writes the state of the object into a stream. Uses Java's built in serialization
   * 
   * @param stream the stream the object will be written to
   * @throws IOException
   */
    private void writeObject(final ObjectOutputStream stream)
        throws IOException {
      stream.defaultWriteObject();
    }

  /**
   * Writes the state of the object into a stream. Uses Java's built in serialization
   * 
   * @param stream the stream the object will be written to
   * @throws IOException
   */
    private void readObject(final ObjectInputStream stream)
        throws IOException, ClassNotFoundException {
      stream.defaultReadObject();
    }
}
