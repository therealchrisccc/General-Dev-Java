import java.util.*;
import java.io.*;
public class filetypeshit {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scnr = new Scanner(System.in);
        String fileName = scnr.next();
        PrintWriter writer = new PrintWriter(fileName, "UTF-8");
        for(int i = 0; i <= 100; i++){
            writer.println(i);
        }
        writer.close();
        scnr.close();
    }

    
}
