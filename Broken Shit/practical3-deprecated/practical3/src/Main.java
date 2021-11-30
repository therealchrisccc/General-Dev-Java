import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter File Name:");
        String fileName = "";
        String fileInputName = scnr.nextLine();
        if (fileInputName == "") {
            fileName = "STEM_Diversity_Data.csv";
        } else {
            fileName = fileInputName;
        }
        System.out.print("Enter Term:");
        String term = "";
        String termInput = scnr.nextLine();
        if (termInput == "") {
            term = "202110";
        } else {
            term = termInput;
        }
        scnr.close();
        CSVReader test = new CSVReader(fileName, true);
    }
}
