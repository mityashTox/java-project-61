package hexlet.code.games;

public class Even implements Game {
    private static final int UPPER_BOUND = 10000;
    private static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static String[][] stackQuestion = new  String[3][2];


    @Override
    public void printGameRule() {
        System.out.println(GAME_RULE);
    }

    @Override
    public String[][] askQuestions() {
        for (int i = 0; i < stackQuestion.length; i++) {
            int randomValue = (int) (Math.random() * UPPER_BOUND);
            stackQuestion[i][0] = Integer.toString(randomValue);
            stackQuestion[i][1] = randomValue % 2 == 0 ? "yes" : "no";
        }
        return stackQuestion;
    }



}
