package fileHandling;

import java.io.*;
import java.util.Scanner;

public class OutputFile {

    public static void main(String[] args) {
        try {
            File inputFile = new File("src/fileHandling/SampleText.txt");
            FileWriter fileWriter = new FileWriter(inputFile, true);
            fileWriter.write("\nThis little light of mine, I'm gonna let it shine");
            fileWriter.close();

            Scanner scan = new Scanner(inputFile);

            int length = (int) inputFile.length();
            int wordCount = 0;
            while (scan.hasNext()) {
                scan.next();
                wordCount++;
            }
            scan.close();

            System.out.println("Length: " + length + " bytes");
            System.out.println("Path: " + inputFile.getAbsolutePath());
            System.out.println("Number of words: " + wordCount);

            File outputFile = new File("src/fileHandling/SampleOutputText.txt");
            FileWriter writer = new FileWriter(outputFile);
            writer.write("Length: " + length + " bytes\n");
            writer.write("Path: " + inputFile.getAbsolutePath() + "\n");
            writer.write("Number of words: " + wordCount + "\n");
            writer.close();

            System.out.println("Output written to SampleOutputText.txt");

        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
