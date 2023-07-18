package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Game;

import java.util.Scanner;

public class Engine {
    private static final int CHOICE_GREETINGS = 1;
    private static final int CHOICE_ENUM = 2;
    private static final int CHOICE_CALC = 3;
    private static final int CHOICE_EXIT = 0;

    private static void startEngine(Game gameSelect) {
        Cli.greetingsCli();
        gameSelect.printGameRule();
        workingGame(gameSelect);
    }

    public static void selectGame() {
        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();
        switch (select) {
            case CHOICE_GREETINGS:
                Cli.greetingsCli();
                break;
            case CHOICE_ENUM:
                startEngine(new Even());
                break;
            case CHOICE_CALC:
                startEngine(new Calc());
                break;
            case CHOICE_EXIT:
                break;
            default:
        }
    }

    private  static void workingGame(Game game) {
        Scanner sc = new Scanner(System.in);
        boolean vinTrue = true;
        boolean sequelTrue = true;
        int i = 0;
        while (sequelTrue && i < 3) {
            String answerTrue = game.askQuestion();
            String answer = sc.next();
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
