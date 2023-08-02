package hexlet.code.games;

public class Prime implements Game {
    private static final int UPPER_BOUND = 1000;
    private static final int PRIME_VALUE_2 = 2;
    private static final int PRIME_VALUE_3 = 3;
    private static final int PRIME_VALUE_5 = 5;
    private static final int PRIME_VALUE_7 = 7;
    private static final String GAME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static String[][] stackQuestion = new  String[3][2];


    @Override
    public void printGameRule() {
        System.out.println(GAME_RULE);
    }

    @Override
    public String[][] askQuestions() {
        for (int i = 0; i < stackQuestion.length; i++) {
            int value = (int) (Math.random() * UPPER_BOUND) + PRIME_VALUE_2;
            String answer;
            if (value == PRIME_VALUE_2 || value == PRIME_VALUE_3 || value == PRIME_VALUE_5 || value == PRIME_VALUE_7) {
                answer = "yes";
            } if (value % PRIME_VALUE_2 != 0 && value % PRIME_VALUE_3 != 0
                    && value % PRIME_VALUE_5 != 0 && value % PRIME_VALUE_7 != 0) {
                answer = "yes";
            } else {
                answer = "no";
            }

            stackQuestion[i][0] = Integer.toString(value);
            stackQuestion[i][1] = answer;
        }
        return stackQuestion;
    }
}


