import java.util.Scanner;

public class quiz1 {
    // Step 1
   public static int doubleOrNothing(int num) {
       if(num < 100){
           num = num * 2;
       }
       else{
            return 0;
       }
       return num;
   }
   // Step 2
   public static String formatPercent(double percent) {
       // student code here
       percent = percent * 100;
       return percent + "%";
   }
   // Step 3
   public static int everyOtherChar(String word) {
       String hold = "";
       int out;
       for(int i = 0; i<=word.length() -1; i++) {
           if ( i % 2 == 0){
               hold = hold + word.charAt(i);
           }
           else{
               continue;
           } 
       }
       out = hold.chars().reduce(0, Integer::sum);
       return out;
   }

   public static void main(String [] args) {
       // test your methods here!
       Scanner scnr = new Scanner(System.in);
       int num = scnr.nextInt();
       System.out.println(doubleOrNothing(num));
       double percent = scnr.nextDouble();
       System.out.println(formatPercent(percent));
       String word = scnr.next();
       System.out.println(everyOtherChar(word));
       scnr.close();
   }
}
