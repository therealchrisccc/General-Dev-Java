public class twelve4 {
    public static void main(String[] args) {
        char letter1;
        char letter2;
        
        letter1 = 'y';
        while (letter1 <= 'z') {
           letter2 = 'a';
           while (letter2 <= 'c') {
              System.out.print("" + letter1
                                    + letter2 + " ");
              ++letter2;
           }
           ++letter1;
        }
    }
}
