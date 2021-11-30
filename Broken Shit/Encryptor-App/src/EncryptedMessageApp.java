import java.util.Scanner;

//import jdk.internal.org.objectweb.asm.util.Printer;

public class EncryptedMessageApp {
    private void askPrompt() {
        System.out.print("Enter Message: ");
    }

    private void printExit() {
        System.out.print("Goodbye");
    }

    private void printSplash() {
        System.out.println("---------");
        System.out.println("-Welcome-");
        System.out.println("---------");
    }

    void run() {
        printSplash();
        while (true) {
            String exitKey = "exit";
            String exitCheck = "";
            Scanner scnr = new Scanner(System.in);
            askPrompt();
            String message = scnr.nextLine();
            //exitCheck = message.substring(0, 4);
            //exitCheck = message;
            if (message.contains(exitKey)) {
                printExit();
                scnr.close();
                System.exit(1);
            }
            typePrompt();
            String method = scnr.nextLine();
            System.out.println(StringManipulator.manipulate(message, method));
        }
    }

    private void typePrompt() {
        System.out.print(StringManipulator.OPTIONS + ": ");
    }
}