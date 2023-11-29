import java.util.Scanner;

public class L4E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //program that asks 3 more quiz questions
        //corrects user if wrong, moves onto next question regardless

        //Q1
        System.out.print("The capital of Spain? ");
        String answer1 = scanner.nextLine();
        //The user will be prompted to enter an answer
        if (answer1.toLowerCase().contains("madrid")==false) {
            //== compares against false.
            System.out.println("Sorry, the correct answer is Madrid.");
        }
        //Q2
        System.out.print("The capital of Ghana? ");
        String answer2 = scanner.nextLine();
        if (answer2.toLowerCase().contains("accra")==false) {
            System.out.println("Sorry the correct answer is Accra.");
        }
        //Q3
        System.out.print("The capital of Nigeria? ");
        String answer3 = scanner.nextLine();
        if (answer3.toLowerCase().contains("abuja")==false) {
            System.out.print("Sorry the correct answer is Abuja.");
        }


    }
}
