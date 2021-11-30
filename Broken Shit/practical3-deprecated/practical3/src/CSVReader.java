import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVReader {
    private static final String DELIMINATOR = ",";
    private Scanner fileScanner;

    // data/test.csv
    public CSVReader(String file, boolean skipHead) {
        try {
            fileScanner = new Scanner(new File(file));
            if (skipHead) {
                fileScanner.nextLine();

            }
        } catch (FileNotFoundException io) {
            System.err.printf("File %s not found%n", file);
            System.exit(1);
        }
    }

    public boolean hasNext() {
        return fileScanner.hasNext();
    }

    public String[] getNext() {
        String line = fileScanner.nextLine();
        if (!line.isEmpty()) {
            return line.split(DELIMINATOR);
        }
        return null;
    }
}
