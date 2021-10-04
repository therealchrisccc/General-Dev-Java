import java.util.Scanner;

public class twelvepoint3 {
   public static void main (String [] args) {
      int numVal;
      int i;

      Scanner input = new Scanner(System.in);
      numVal = input.nextInt();

      for (i = numVal; i >= 1; --i) {
         System.out.println(i);
      }
      input.close();
   }
   
}
