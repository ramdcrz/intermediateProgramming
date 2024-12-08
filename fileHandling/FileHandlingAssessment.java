package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandlingAssessment {

    public static void main(String[] args) {
        Scanner scan = openFile();
        processFile(scan);
        closeFile(scan);
    }

    public static Scanner openFile() {
        try {
            File file = new File("src/fileHandling/SampleText.txt");
            Scanner scan = new Scanner(file);
            return scan;
        } catch (FileNotFoundException e) {
            System.err.println("Error opening file: " + e.getMessage());
            System.exit(1);
            return null;
        }
    }

    public static void processFile(Scanner scan) {
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            System.out.println(line);
        }
    }

    public static void closeFile(Scanner scan) {
        scan.close();
    }
}
