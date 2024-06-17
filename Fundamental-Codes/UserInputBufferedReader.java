import java.io.BufferedReader;
import java.io.IOException; //Purpose : We import necessary classes for input/output operations (BufferedReader, IOException, and InputStreamReader). why we import this
import java.io.InputStreamReader;
/*io.InputStreamReader; converts byte streams (like System.in, which is an InputStream) into character streams that can be read by BufferedReader.
 * It enables reading of textual data from byte-oriented sources, making it essential for handling input in a character-oriented way.
 */

public class UserInputBufferedReader {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter your name: ");
            String name = reader.readLine();
            System.out.println("Hello, " + name);
        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}
/*
  Scanner is preferred when:
    Interacting with user input in console-based applications.
    Needing to parse different types of input (integers, floats, etc.).
    Performance is not a critical factor.

BufferedReader is preferred when:
    Reading large amounts of data efficiently, especially from files.
    Performance is a critical factor.
    Working in multithreaded environments.
 */