import java.util.Scanner;

public class apptesting {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String message = scnr.nextLine();
        System.out.println(message.substring(0, 4));
        if (message == "quit") {
            System.out.print("exiting");
        }
        scnr.close();
    }
}
