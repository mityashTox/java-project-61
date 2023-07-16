package hexlet.code;

import java.util.Scanner;

public class Even {
    private static final int UPPER_BOUND = 10000;
    public static void playEven() {
        boolean vinTrue = true;
        boolean sequelTrue = true;
        int i = 0;
        Cli.greetingsCli();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (sequelTrue && i < 3) {
            int randomValue = (int) (Math.random() * UPPER_BOUND);
            System.out.println("Question: " + randomValue);
            System.out.print("Your answer: ");
            Scanner sc = new Scanner(System.in);
            String answer = sc.next();
            String answerTrue = randomValue % 2 == 0 ? "yes" : "no";
            if (answer.equals(answerTrue)) {
                System.out.println("Correct!");
            } else {
                sequelTrue = false;
                vinTrue = false;
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + answerTrue + "'.");
            }
            i++;
        }
        if (sequelTrue) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}
