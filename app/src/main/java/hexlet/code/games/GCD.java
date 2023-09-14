package hexlet.code.games;

import hexlet.code.Engine;

public final class GCD implements Game {
    private static final int UPPER_BOUND = 1000;
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
        String[][] stackQuestion = new  String[3][2];
        for (int i = 0; i < stackQuestion.length; i++) {
            int randomValue1 = (int) (Math.random() * UPPER_BOUND);
            int randomValue2 = (int) (Math.random() * UPPER_BOUND);
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


