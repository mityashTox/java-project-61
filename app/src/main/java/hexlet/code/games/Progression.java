package hexlet.code.games;

import hexlet.code.Engine;

public final class Progression implements Game {
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
        String[][] stackQuestion = new  String[3][2];
        for (int i = 0; i < stackQuestion.length; i++) {
            int progressionLength = (int) (Math.random() * BOUND_PROGRESSION_LENGTH) + PROGRESSION_LENGTH;
            int hiddenPosition = (int) (Math.random() * progressionLength);
            int progressionCoefficient = (int) (Math.random() * BOUND_PROGRESSION_COEFFICIENT)
                    + PROGRESSION_COEFFICIENT;
            int startProgressionValue = (int) (Math.random() * BOUND_START_PROGRESSION);
            String answer = null;
            StringBuilder stringBuilder = new StringBuilder();

            for (int j = 0; j < progressionLength; j++) {
                if (j == hiddenPosition) {
                    stringBuilder.append(".. ");
                    answer = Integer.toString(startProgressionValue);
                } else {
                    stringBuilder.append(startProgressionValue).append(" ");
                }
                startProgressionValue += progressionCoefficient;
            }
            stackQuestion[i][0] = stringBuilder.toString();
            stackQuestion[i][1] = answer;
        }
        return stackQuestion;
    }


}
