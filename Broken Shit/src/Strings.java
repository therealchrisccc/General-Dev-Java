/**
 * Strings lab for CS 1.
 *
 * In this lab, you will write methods to practice with strings and chars,
 * while reviewing the structure of methods and their signatures.
 *
 * @author YOUR_NAME
 *         YOUR_EMAIL
 * @version 202010
 */
public class Strings{
    // STEP one - concatenateStrings()
   public static String concatenateStrings(String string1, String string2){
      String concatenation = string1 + " " + string2;
      System.out.print("debug");
      System.out.print(string1);
      return concatenation;
   }
    // STEP two - charToASCII()
   public int charToASCII(char test){
        return (int) test;
   }
    // STEP three
    public char getLastChar(String str){
        //student code here
        char hold = str.charAt(str.length() -1);
        hold = Character.toUpperCase(hold);
        return hold; //  this line will need to be changed
    }

    // step 4
    public String translateWord(String str){
        //student code here
        int sum = str.chars().reduce(0, Integer::sum);
        return (""+ sum); //  this line will need to be changed
    }

    // step 5
    public String madLib(String noun1, double number, String pastTenseVerb, String adjective, String noun2) {
        //student code here
        return ""; // this line will need to be changed
    }
    /**
     * A test block helps you test as you write. Eventually, you will learn
     * test driven development, in which every method you write will have tests you write
     * to make sure it works.
     *
     * Uncomment these lines out as you finish your various methods
     */
    public void runTests() {
         System.out.println();
        // Concatenate Strings test
         System.out.println("Testing concatenateStrings method: ");
         System.out.println("Input: 'good','morning' \t Expecting: good morning\t Actual: " + concatenateStrings("good", "morning"));

         System.out.println();
        // Char to ASCII test
         System.out.println("Testing charToASCII method: ");
         System.out.println("Input: 'c' \t Expecting: 99\t Actual:" + charToASCII('c'));

         System.out.println();
        // Get Last Char test
         System.out.println("Testing getLastChar method: ");
         System.out.println("Input: 'Pterodactyl' \t Expecting: L\t Actual: " + getLastChar("Pterodactyl"));

         System.out.println();
        // Translate Word Test
         System.out.println("Testing Translate word method: ");
         System.out.println("Input: 'yams' \t Expecting: 121 97 109 115\t Actual: " + translateWord("yams"));

        // System.out.println();
        // Mad Libs Test
        // System.out.println("Testing Mad Libs method: ");
        // System.out.println("Input: 'pear, 202.356, swam, purple, bear'"
        //      + "\nExpecting: Today I went to the store and bought a pear for $202.36.\nThen I swam and saw a purple bear."
        //      + "\nActual: " + madLib("pear", 202.356, "swam", "purple", "bear"));

    }


    public static void main(String [] args) {
        // running test method
        Strings f = new Strings();
        f.runTests();  // this is not a static method (should it have been?) so you have to run it with the object
    }
}