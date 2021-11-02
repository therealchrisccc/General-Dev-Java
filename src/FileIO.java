
/**
 * FileIO lab for CS 1.
 *
 * In this lab you will be writing methods to read from a file and write output to a new file
 *
 * @author YOUR_NAME
 *         YOUR_EMAIL
 * @version 202010
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {

    // Part 1
    public static String[] readFile(String filename) {

        // Student Code Here
        String[] lines = new String[1000];
        int lineCounter = 0;

        try {
            Scanner scnr = new Scanner(new File(filename));
            while (scnr.hasNext()) {
                lines[lineCounter] = scnr.next();
                lineCounter++;
            }
            scnr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // 3 lines below given to students. DO NOT MODIFY
        String[] rtn = new String[lineCounter];
        System.arraycopy(lines, 0, rtn, 0, lineCounter);
        return rtn;
    }

    // Part 2
    public static void reverseFile(String[] parsedFile, String filename) {

        // Student Code Here
        try {
            FileWriter fileWriter = new FileWriter(new File(filename));
            for (int i = parsedFile.length; i > 0; i--) {
                fileWriter.println(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    // Part 3
    public static void logFile(String[] parsedFile, String filename) {

        // Student Code Here

    }

    public static void main(String[] args) {
        readFile("prince.txt");
        reverseFile(readFile("prince.txt"), "reversed.txt");
    }

}