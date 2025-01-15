import java.io.FileWriter;
import java.io.IOException;
public class FileWriterClass {
    /* 
    public static void main(String[] args) throws IOException {
        String fileName = "java-course.txt";
        FileWriter writer = new FileWriter(fileName);
        try {
            writer.write("Welcome to Java Course!");
            writer.flush();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        } 
        finally {
            writer.close();
        }
    }
        */
        public static void main(String[] args) {
            String fileName = "java-course.txt";
            // try-with-resources statement 
            // esme file close nahi karna padega finally block me yah automatic file close
            try(FileWriter writer = new FileWriter(fileName)) {
                writer.write("This file contains the Java Course.");
                writer.flush();
            } catch (IOException e) {
                System.out.println("An error occurred.");
                System.out.println(e.getMessage());
            }
        }
}