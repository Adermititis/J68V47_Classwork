import java.util.*;
public class L3E2 {
    public static void main(String[] args) {
        //Program to generate applicable answers to quiz
        Scanner scanner = new Scanner(System.in);

        //Q1
        System.out.print("Q1: Capital of Spain?: ");
        String answer1 = scanner.nextLine();
        //User enters capital of spain in upper or lower case.
        //capital being Madrid.
        //System will display True if the correct answer is given and display false if incorrect.
        System.out.println(answer1.toLowerCase().contains("madrid"));
        //Q2
        System.out.print("Q2: Capital of the UK?: " );
        String answer2 = scanner.nextLine();
        System.out.println(answer2.toLowerCase().contains("london"));

        //Q3
        System.out.print("Q3: Capital of the Italy?: " );
        String answer3 = scanner.nextLine();
        System.out.println(answer3.toLowerCase().contains("rome"));



    }
}
