package hexlet.code;

import hexlet.code.games.Game;

import java.util.Scanner;

public class Engine {

    public static void workingGame(Game game) {
        Scanner sc = new Scanner(System.in);
        boolean vinTrue = true;
        String[][] stackQuestion = game.askQuestions();

        Cli.greetingsCli();
        game.printGameRule();

        for (int i = 0; i < stackQuestion.length; i++) {
            System.out.println("Question: " + stackQuestion[i][0]);
            System.out.print("Your answer: ");
            String answer = sc.next();
            if (answer.equals(stackQuestion[i][1])) {
                System.out.println("Correct!");
            } else {
                vinTrue = false;
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                        + stackQuestion[i][1] + "'.\n"
                + "Let's try again, " + Cli.getName() + "!");
                break;
            }
        }
        if (vinTrue) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
        }
    }
}

