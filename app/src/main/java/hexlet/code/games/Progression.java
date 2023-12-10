package hexlet.code.games;

import hexlet.code.Engine;

public final class Progression implements Game {
    private static final int ARRAY_SIZE_1 = 3;
    private static final int ARRAY_SIZE_2 = 2;
    private static final int BOUND_PROGRESSION_LENGTH = 5;
    private static final int BOUND_PROGRESSION_COEFFICIENT = 5;
    private static final int PROGRESSION_LENGTH = 5;
    private static final int BOUND_START_PROGRESSION = 10;
    private static final int PROGRESSION_COEFFICIENT = 10;
    private static final String GAME_RULE = "What number is missing in the progression?";

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
           String[] progression = createProgression();
           int hiddenPosition = (int) (Math.random() * progression.length);
           stackQuestion[i][1] = progression[hiddenPosition];
           progression[hiddenPosition] = "..";
           stackQuestion[i][0] = String.join(" ", progression);
        }
        return stackQuestion;
    }

    private static String[] createProgression () {
        int progressionLength = (int) (Math.random() * BOUND_PROGRESSION_LENGTH) + PROGRESSION_LENGTH;
        int progressionCoefficient = (int) (Math.random() * BOUND_PROGRESSION_COEFFICIENT)
                + PROGRESSION_COEFFICIENT;
        int startProgressionValue = (int) (Math.random() * BOUND_START_PROGRESSION);
        String[] stackQuestion = new  String[progressionLength];
        stackQuestion[0] = String.valueOf(startProgressionValue);

        for (int i = 1; i < stackQuestion.length; i++) {
            stackQuestion[i] = String.valueOf(startProgressionValue + progressionCoefficient * i);
        }
        return stackQuestion;
    }
}
