import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public abstract class MyMath implements Serializable{

  abstract String getHistory();

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
}