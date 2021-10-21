import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter File Name:");
        String fileName = "";
        if(scnr.next() == ""){
            fileName = "STEM_Diversity_Data.csv";
        }
        else{
            fileName = scnr.next();
        }
        String term = "";
        if(scnr.next() == ""){
            term = "202110";
        }
        else{
            term = scnr.next();
        }
        scnr.close();
        CSVReader test = new CSVReader(fileName, true);
    }
}
