import java.util.*;

public class L4E1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstname = scanner.nextLine();
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter total value of order: £");
        float orderTotal = scanner.nextFloat();
        System.out.print("Enter amount you wish to deposit: £");
        float deposit = scanner.nextFloat();

        //receipt display
        System.out.println("== RECEIPT ==");
        System.out.format("Customer: %s %s %n",firstname.substring(0,1),surname);
        //Display "customer - string1 - string 2 - newLine, first letter of first name, surname
        System.out.format("Order Total: £%.2f %n",orderTotal);
        //Displaying order total to 2 decimal points
        System.out.format("Deposit paid: £%.2f %n", deposit);
        //Displaying deposit total to 2 decimal points
        System.out.format("Outstanding amount: £%.2f %n",(orderTotal-deposit));
        //Displaying outstanding total by deducting order total by deposit
        if (deposit > 100) {
            System.out.println("Congratulations you qualify for a free toatser!");
        }
        System.out.println("Have a good day");

    }
}
