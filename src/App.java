
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Scanner scnr = new Scanner(System.in);
        double outsideTemperature;
  
        outsideTemperature = scnr.nextDouble();
  
        /* Your solution goes here  */
        System.out.printf("%.2f", outsideTemperature);
    }
}