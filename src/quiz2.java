public class quiz2 {
    char [] classArr;
    public static void main(String[] args) {
        arrayToUpperCaseString();
        
    }

    // Step 1
    public quiz2(char c1, char c2, char c3) {
        char[] classArr = new char[3];
        classArr[0] += c1;
        classArr[1] += c2;
        classArr[2] += c3;
    }

    // Step 2
    public static String arrayToUpperCaseString() {
        String hold = String.valueOf(quiz2.classArr);
        hold = hold.toUpperCase();
       return hold;
    }

    // Step 3
    public static String arrayToReverseString(){
       return "";
    }

}