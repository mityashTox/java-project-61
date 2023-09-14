package hexlet.code.games;

import hexlet.code.Engine;

public final class Even implements Game {
    private static final int UPPER_BOUND = 10000;
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
        int ARRAY_SIZE_1 = 3;
        int ARRAY_SIZE_2 = 2;
        String[][] stackQuestion = new  String[ARRAY_SIZE_1][ARRAY_SIZE_2];
        for (int i = 0; i < stackQuestion.length; i++) {
            int randomValue = (int) (Math.random() * UPPER_BOUND);
            stackQuestion[i][0] = Integer.toString(randomValue);
            stackQuestion[i][1] = randomValue % 2 == 0 ? "yes" : "no";
        }
        return stackQuestion;
    }



}
