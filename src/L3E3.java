import java.util.*;
public class L3E3 {
    //create a program that asks users to enter;
    //-The cost  of a loan
    //-The interest Rate
    //-The number of years for the loan.
    //Use following formula (M = L * (j / (1+j)^-n))
    //M = monthly payment
    //L = loan amount
    //j = interest rate in months (5% per month = 0.05/12)
    //n = number of years * 12
    public static void main(String[] args) {
        //asking for user input
        Scanner scanner = new Scanner(System.in);
        //cost of the loan
        System.out.print("Loan amount: £");
        float L = scanner.nextFloat();
        //Interest rate
        System.out.print("Interest rate (APR %): ");
        int rate = scanner.nextInt();
        //Number of years for the loan
        System.out.print("Number of years: ");
        int years = scanner.nextInt();

        float j = ((float) rate / 100)/12;
        //e.g. if 5% = (5 / 100 = 0.05) / 12 = 0.00417

        int n = years * 12;
        //converts years into months

        //monthly payments with the following formula;
        float M = (float) (L * ( j / (1 - Math.pow((1+j),-n) ) ));
        //e.g. M = 1000(0.00417(1-0.00417)^48
        System.out.format("Monthly payment for this loan = £%.2f",M);



    }
}
