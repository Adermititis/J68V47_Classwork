import java.util.*;

public class L2E2 {

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("What is your name?: ");
                String name = scanner.nextLine();

                System.out.print("Enter your hobby: ");
                String hobby = scanner.nextLine();

                String story = name + " loves " + hobby +
                        " in their free time.\n They find it enjoyable and motivating to watch their " + hobby +
                        " skills improve over time.\n" + hobby + " allows " + name + " express who they are as a person.";
                System.out.println(story);
        }
}