
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Throws {

    // Method that throws an IOException if the file can't be read
    public static void readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line;
        System.out.println("Reading from file: " + fileName);

        // Read the file line by line
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close(); // Close the file after reading
    }

    public static void main(String[] args) {

        // Correct file path       
        String filePath = "./ExceptionAndErrorHandling/sample.txt";

        //Use following flie path to Intentionally trigger an exception (wrong path)
        // String filePath = "./ExceptionAndErrorHandling/samples.txt"; 
        
        try {
            readFile(filePath); // Call the method
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
