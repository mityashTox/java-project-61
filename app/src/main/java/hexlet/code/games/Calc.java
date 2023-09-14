package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Calc implements Game {
    private static final int ARRAY_SIZE_1 = 3;
    private static final int ARRAY_SIZE_2 = 2;
    private static final String GAME_RULE = "What is the result of the expression?";
    private static final int SWITCH_PLUS = 2;
    private static final int SWITCH_MINUS = 6;
    private static final int INCREASE_THE_MANTISSA = 10;


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
            int answer;
            String expression;
            if (Math.random() * INCREASE_THE_MANTISSA < 3) {
                answer = randomValue1 + randomValue2;
                expression = "+";
            } else if (Math.random() * INCREASE_THE_MANTISSA >= SWITCH_PLUS && Math.random()
                    * INCREASE_THE_MANTISSA < SWITCH_MINUS) {
                answer = randomValue1 - randomValue2;
                expression = "-";
            } else {
                answer = randomValue1 * randomValue2;
                expression = "*";
            }
            stackQuestion[i][0] = randomValue1 + " " + expression + " " + randomValue2;
            stackQuestion[i][1] = Integer.toString(answer);
        }
        return stackQuestion;
    }


}
