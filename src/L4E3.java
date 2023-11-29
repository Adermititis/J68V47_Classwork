import java.util.Scanner;

public class L4E3 {
    public static void main(String[] args) {
        //program to calculate shipping charges
        //if total is less than £50 then add £10 shipping charge
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter total purchase amount: ");
        double totalPurchase = scanner.nextDouble();
        double shippingCost = 10.0;
        //if total is > 50 then shipping = 0, it will be free
        if (totalPurchase > 50.0){
            shippingCost = 0.0;
            //shipping = 10 if total purchase < 50
        }
        double finalTotal = totalPurchase + shippingCost;
        System.out.format("Shipping cost is: £%.2f%n",shippingCost);
        System.out.format("Your total amount is: £%.2f", finalTotal);

    }
}
