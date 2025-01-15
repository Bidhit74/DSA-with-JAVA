// File Not Found Exception Handling
// Write a program to read a filename from the user and display its content. The program should handle the situation where the file does not exist.
// Key Points
// Use Scanner to read the filename from the user.
// Use FileReader to read the file content.
// Implement a try-catch block to handle FileNotFoundException.
// Display a message informing the user if the file not found

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class FileProblemQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = sc.nextLine();
        sc.close();
        try (FileReader reader = new FileReader(fileName)) {
            int character;
            /* 
            do {
                character = reader.read();
                System.out.print((char) character);
            } while (character != -1);
             */
            // or
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
            System.out.println(e.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
