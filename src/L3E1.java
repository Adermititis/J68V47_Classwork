package Lesson3;
import java.util.*;
public class L3E1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Looking for keyboard inputs from user.
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine(); // setting up string and storing first name as variable.
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter year of birth: ");
        String year = scanner.nextLine();

        //1st letter of the user's first name e.g. A
        //Entire surname in lower case e.g christie
        String username = firstName.substring(0,1) + surname.toLowerCase();
        //first letter of firstname variable stored in username as well as lower case surname
        System.out.println("Username: "+username);

        //password should contain;
        //lower case initial surname
        //upper case first name
        //year of birth
        String password = surname.substring(0,1).toLowerCase() + firstName.substring(0,3).toUpperCase() + year;
        System.out.println("password: "+password);





    }
}
