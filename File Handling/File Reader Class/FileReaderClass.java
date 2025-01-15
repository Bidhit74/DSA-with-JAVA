import java.io.FileReader;
import java.io.IOException;
public class FileReaderClass {
    public static void main(String[] args) {
        String fileName = "java-course.txt";
        try (FileReader reader = new FileReader(fileName)) {
            int character = 0;
            do{
                character = reader.read();
                System.out.print((char) character);
            }
            while (character != -1);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            System.out.println(e.getMessage());
        }
    }
}
