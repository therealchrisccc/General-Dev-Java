import java.util.Scanner;

public class EncryptedMessageApp {
    private void askPrompt(){
        System.out.print("Enter Message: ");
    }

    private void printExit(){
        System.out.print("Goodbye");
    }

    private void printSplash(){
        System.out.println("---------");
        System.out.println("-Welcome-");
        System.out.println("---------");
    }
    void run(){
        printSplash();
        askPrompt();
        Scanner scnr = new Scanner(System.in);
        String message = scnr.nextLine();
        typePrompt();
        String method = scnr.nextLine();
        scnr.close();
        System.out.println(StringManipulator.manipulate(message, method));
    }
    private void typePrompt() {
        System.out.print(StringManipulator.OPTIONS + ": ");
    }
}