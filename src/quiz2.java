public class quiz2 {
    static char [] classArr;
    public static void main(String[] args) {
        quiz2 test = new quiz2('a', 'b', 'c');
        System.out.println(quiz2.arrayToReverseString(classArr));
        System.out.println(test.arrayToUpperCaseString());
    }

    // Step 1
    public quiz2(char c1, char c2, char c3) {
        char[] classArr = new char[3];
        classArr[0] += c1;
        classArr[1] += c2;
        classArr[2] += c3;
    }

    // Step 2
    public String arrayToUpperCaseString() {
        String hold = String.valueOf(classArr);
        hold = hold.toUpperCase();
       return hold;
    }
    // Step 3
    public static String arrayToReverseString(char[] arrayinput){
        String out = "";
        for(int i = arrayinput.length - 1; i >= 0; i--){
            out += arrayinput[i];
        }
       return out;
    }

}