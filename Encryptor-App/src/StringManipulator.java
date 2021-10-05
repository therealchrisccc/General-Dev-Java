public class StringManipulator {
    public static final String OPTIONS = "Cipher,Encode,Compress";
    public static final String VOWELS = "aeiouAEIOU";

    public static String encrypt(String msg, int shift){
        String out = "";
        char holdChar;
        int holdInt;
        for(int i = 0; i < msg.length(); i++){
            holdChar = msg.charAt(i);
            holdInt = (int)holdChar + shift;
            out = out + (char)holdInt;
        }
        return out;
    }

    public static void main(String[] args){
        System.out.println(encrypt("test 123", -1));
        System.out.println(stringCompress("compression sample"));
    }

    public static String manipulate(String msg, String type){
        int i = 0;
        String hold = "";
        for(i = 0; i < msg.length(); i++){
            msg.charAt(i);
        }
        return msg;
    }

    public static String runLengthEncoding(String msg){
        return msg;
    }

    public static String stringCompress(String msg){
        msg = msg.replaceAll("[" + VOWELS + "]", "");
        return msg;
    }
}
