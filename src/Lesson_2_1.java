import java.util.*;

public class Lesson_2_1 {

        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("What is your name? ");
                String name = input.nextLine();

                String firstName1 = "Bob";
                System.out.println(firstName1);

                firstName1 = "Mary";
                System.out.println(firstName1);

                Scanner input1 = new Scanner(System.in);
                System.out.print("What is your first name? ");
                String firstName = input1.nextLine();

                System.out.print("What is your last name? ");
                String lastName = input1.nextLine();

                System.out.println("Hello " + firstName + " " + lastName);


        }
}