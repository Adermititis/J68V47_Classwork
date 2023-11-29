import java.util.Scanner;

public class L6E2 {
    public static void main(String[] args) {
        //create program that displays options to user.
        //use while loop to display menu until user chooses quit.
        //options to include;
        //1.say hello
        //2.tell me the time
        //3.tell me a joke
        //4.quit
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("Menu");
            System.out.println("1. Say Hello.");
            System.out.println("2. Tell me the time.");
            System.out.println("3. Tell me a joke");
            System.out.println("4. Quit.");
                //creating menu display for user to choose options.

            System.out.println("Please select an option: ");
            option = scanner.nextInt();
            System.out.format("Option: %d, chosen. %n", option);
            if (option == 1) {
                System.out.println("Hello.\n");
//checks to see if '1' was entered by user, if not moves to next line
            } else if (option == 2) {
                System.out.println("The time is now.\n");
//'else if' is the alternative condition and checks the user input again, this time for '2'.
            } else if (option == 3) {
                System.out.println("Really funny joke.\n");

            } else if (option == 4) {
                System.out.println("Goodbye.");

            } else {
                System.out.println("This isn't a valid option, please choose another.");
            }
        } while (option != 4);
    }
}
