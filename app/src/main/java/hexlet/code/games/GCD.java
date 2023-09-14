package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class GCD implements Game {
    private static final int ARRAY_SIZE_1 = 3;
    private static final int ARRAY_SIZE_2 = 2;
    private static final String GAME_RULE = "Find the greatest common divisor of given numbers.";

    @Override
    public void printGameRule() {
        System.out.println(GAME_RULE);
    }

    @Override
    public void startGame() {
        Engine.workingGame(this);
    }

    @Override
    public String[][] askQuestions() {
        String[][] stackQuestion = new  String[ARRAY_SIZE_1][ARRAY_SIZE_2];
        for (int i = 0; i < stackQuestion.length; i++) {
            int randomValue1 = Utils.makeRandomValue();
            int randomValue2 = Utils.makeRandomValue();
            int max = Math.max(randomValue1, randomValue2);
            int min = Math.min(randomValue1, randomValue2);
            int divisor = 0;

            while (min != 0) {
                divisor = min;
                min = max % min;
                max = divisor;
            }
            stackQuestion[i][0] = randomValue1 + " " + randomValue2;
            stackQuestion[i][1] = Integer.toString(divisor);
        }

        return stackQuestion;
    }
}


