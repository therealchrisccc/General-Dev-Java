public class StringManipulator {
    public static final String OPTIONS = "Cipher,Encode,Compress";
    public static final String VOWELS = "aeiouAEIOU";

    public static String encrypt(String msg, int shift) {
        String out = "";
        char holdChar;
        int holdInt;
        for (int i = 0; i < msg.length(); i++) {
            holdChar = msg.charAt(i);
            holdInt = (int) holdChar + shift;
            out = out + (char) holdInt;
        }
        return out;
    }

    public static void main(String[] args) {
        // System.out.println(encrypt("test 123", -1));
        // System.out.println(stringCompress("You can be a good programmer if you can
        // read this"));
        // System.out.println(stringCompress(""));
        System.out.println(manipulate("test 123", "cipher:-1"));
        System.out.println(manipulate("test message", "compress"));
        System.out.println(manipulate("You can be a good programmer if you can read this", "compress"));
    }

    public static String manipulate(String msg, String type) {
        int shift = 0;
        String hold = type.substring(0, 6);
        if (hold.contains("cipher")) {
            String amount = "";
            amount = type.substring(7);
            shift = Integer.parseInt(amount);
            return encrypt(msg, shift);
        }
        if (type.contains("encode")) {
            return runLengthEncoding(msg);
        } else {
            return stringCompress(msg);
        }
    }

    public static String runLengthEncoding(String msg) {
        return msg;
    }

    public static String stringCompress(String msg) {
        String hold = "";
        for (String temp : msg.split(" ")) {
            if (temp.length() > 1) {
                msg = temp;
                msg = msg.replaceAll("[" + VOWELS + "]", "");
                hold += msg + " ";
            } else {
                hold += temp + " ";
            }
        }
        msg = msg.replaceAll("[" + VOWELS + "]", "");
        return hold;
    }
}

/*
 * int i = 0; String hold = ""; for(i = 0; i < msg.length(); i++){
 * msg.charAt(i); } return msg;
 */