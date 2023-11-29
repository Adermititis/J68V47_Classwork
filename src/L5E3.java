import java.util.Scanner;
public class L5E3 {
    public static void main(String[] args) {
        //create a maths quiz that loops through 10 questions,
        //keeping track of the scores for correct answers using selection statement.
        Scanner scanner = new Scanner(System.in);

        int score = 0;
        int input;
        int answer;
        //variables, score starts at 0,
        //input + answer are created variables used for later.
        for (int count=1; count <= 10; count++){
            System.out.format("What is %d + %d: ",count, count*count);
            input = scanner.nextInt();
            answer = count + (count*count);
            if (answer == input){
                System.out.println("Correct.");
                score++;
            } else {
                System.out.format("Incorrect, the answer was: %d %n", answer);
            }
        }
        System.out.format("Game complete, your score is: %d %n", score);


    }
}
