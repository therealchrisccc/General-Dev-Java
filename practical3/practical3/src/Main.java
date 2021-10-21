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
        CSVReader test = new CSVReader(fileName, true);
    }
}
