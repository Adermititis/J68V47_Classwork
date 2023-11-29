import java.util.*;
public class L2E3 {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Enter the name of item 1: ");
        String name1 = scanner1.nextLine();
        System.out.print("Enter the price of item 1: ");
        float price1 = scanner1.nextFloat();


        System.out.print("Enter the name of item 2: ");
        String name2 = scanner2.nextLine();
        System.out.print("Enter the price of item 2: ");
        float price2 = scanner2.nextFloat();

        System.out.print("Enter the name of item 3: ");
        String name3 = scanner3.nextLine();
        System.out.print("Enter the name of item 3: ");
        float price3 = scanner3.nextFloat();

        float subtotal = price1 + price2 + price3;

        System.out.println("ADSA");
        System.out.format("%s.........%.2f %n" ,name1,price1); // %s = String, %.2f = Float
        System.out.format("%s.........%.2f %n" ,name2,price2);
        System.out.format("%s.........%.2f %n" ,name3,price3);
        System.out.format("SUBTOTAL.........%.2f %n" ,subtotal);

    }
}
