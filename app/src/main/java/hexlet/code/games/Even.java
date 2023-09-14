package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Even implements Game {
    private static final int ARRAY_SIZE_1 = 3;
    private static final int ARRAY_SIZE_2 = 2;
    private static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

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
            int randomValue = Utils.makeRandomValue();
            stackQuestion[i][0] = Integer.toString(randomValue);
            stackQuestion[i][1] = randomValue % 2 == 0 ? "yes" : "no";
        }
        return stackQuestion;
    }



}
