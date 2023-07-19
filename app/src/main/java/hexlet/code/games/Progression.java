package hexlet.code.games;

public class Progression implements Game {
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
    public String askQuestion() {
        int progressionLength = (int) (Math.random() * BOUND_PROGRESSION_LENGTH) + PROGRESSION_LENGTH;
        int hiddenPosition = (int) (Math.random() * progressionLength);
        int progressionCoefficient = (int) (Math.random() * BOUND_PROGRESSION_COEFFICIENT) + PROGRESSION_COEFFICIENT;
        int startProgressionValue = (int) (Math.random() * BOUND_START_PROGRESSION);
        String answer = null;
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < progressionLength; i++) {
            if (i == hiddenPosition) {
                stringBuilder.append(".. ");
                answer = Integer.toString(startProgressionValue);
            } else {
                stringBuilder.append(startProgressionValue).append(" ");
            }
            startProgressionValue += progressionCoefficient;
        }
        System.out.println("Question: " + stringBuilder);
        System.out.print("Your answer: ");
        return answer;
    }
}
