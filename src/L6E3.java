import java.util.Scanner;
public class L6E3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        int lives = 3;
        int input;
        int answer;
        int count = 1;
        while (count <= 10 && lives > 0) {
            System.out.format("What is %d + %d: ", count, count * count);
            input = scanner.nextInt();
            answer = count + (count * count);
            if (answer == input) {
                System.out.println("Correct.");
                score++;
            } else {
                System.out.format("Incorrect, the answer was: %d %n", answer);
                lives--;
                System.out.format("You have %d lives remaining. %n", lives);
            }
            count++;
            //drops out of while loop if; count becomes 11, lives become 0.
        }
        System.out.format("Game over. Your final score is: %d %n", score);
        if (lives > 0){
            System.out.println("Congratulations.");
        }

    }
}