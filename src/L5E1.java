import java.util.Scanner;
public class L5E1 {
    //create a timestable program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a base number: ");
        int initialNum = scanner.nextInt();
        //using scanner to take in initial number.

        for (int count=1; count <=12; count++){
            //create fixed loop counting from 1 up until 12.
            //count++ is the incrament which increases the count by 1.
            System.out.format("%d x %d =%d %n",initialNum, count, (initialNum*count));
            //%d placeholder determines the parameters position in print.
            //%n new line.
        }
    }
}
