import java.util.Scanner;

public class Main {
    static String fileName = "";
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a file to load:");
        String fileInputName = scnr.nextLine();
        if (fileInputName.equals("")) {
            fileName = "STEM_Diversity_Data.csv";
        } else {
            fileName = fileInputName;
        }
        System.out.print("Term:");
        String term = "";
        String termInput = scnr.nextLine();
        if (termInput == "") {
            term = "202110";
        } else {
            term = termInput;
        }
        scnr.close();
        Data start = new Data(term);
        start.loadData(fileName);
        start.printStats();
    }
}
