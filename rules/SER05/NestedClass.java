/**
 * Rule: SER05-J. Do not serialize instances of inner classes
 * 
 * Description: When using java serialization, it’s important that only the outer class implements Serializeable. 
 *              Any inner class cannot implement serializable, unless that inner class is static. 
 * 
 * @author Carl Ghess
 */
package SER05;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * An example of a class which holds an inner serializable static class
 */
public class NestedClass implements Serializable {

  int num1, num2;

  /**
   * Basic constructor for NestedClass
   * 
   * @param num1 any integer
   * @param num2 any integer
   */
  public NestedClass(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
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
   * Reads the state of the object from an input stream. Uses Java's built in serialization
   * 
   * @param stream the stream the object will be read from
   * @throws IOException
   * @throws ClassNotFoundException
   */
  private void readObject(final ObjectInputStream stream)
      throws IOException, ClassNotFoundException {
    stream.defaultReadObject();
  }

  /**
   * A simple static inner class that implements Serializable
   */
  public static class InnerClass implements Serializable {
    static int num3 = 3;
  }

  /**
   * Returns the value contained in the inner class
   * 
   * @return int
   */
  public int getInnerClassVal() {
    return InnerClass.num3;
  }
}
