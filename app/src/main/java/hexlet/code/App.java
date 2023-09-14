package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final int CHOICE_GREETINGS = 1;
    private static final int CHOICE_EVEN = 2;
    private static final int CHOICE_CALC = 3;
    private static final int CHOICE_GCD = 4;
    private static final int CHOICE_PROGRESSION = 5;
    private static final int CHOICE_PRIME = 6;
    private static final int CHOICE_EXIT = 0;
    public static void main(String[] args) {
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit\n"
                + "Your choice: ");
        selectGame();
    }
    public static void selectGame() {
        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();
        switch (select) {
            case CHOICE_GREETINGS:
                Cli.greetingsCli();
                break;
            case CHOICE_EVEN:
                new Even().startGame();
                break;
            case CHOICE_CALC:
                new Calc().startGame();
                break;
            case CHOICE_GCD:
                new GCD().startGame();
                break;
            case CHOICE_PROGRESSION:
                new Progression().startGame();
                break;
            case CHOICE_PRIME:
                new Prime().startGame();
                break;
            case CHOICE_EXIT:
                break;
            default:
        }
    }
}
