import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ) {
        Scanner scanner = null;
        String userInput;
        boolean loggedIn = false;
        while (!loggedIn) {
            int i = 1;
            System.out.println("Please enter your name");
            scanner = new Scanner(System.in);
            userInput = String.valueOf(scanner.nextLine());
            if (userInput.equalsIgnoreCase("Alice") || userInput.equalsIgnoreCase("Bob")){
                System.out.println("Welcome " + userInput + "!");
                loggedIn = true;
            }
            else {
                System.out.println("Unknown user!");
            }
        }
    }
}
