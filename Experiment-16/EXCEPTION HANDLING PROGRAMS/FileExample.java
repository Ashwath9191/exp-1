import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("nonexistent.txt"); // File doesn't exist
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found: " + e.getMessage());
        }
    }
}
