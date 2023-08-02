package hexlet.code.games;

import java.math.BigInteger;

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
            BigInteger bigInteger = BigInteger.valueOf(value);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(value));
            String answer;
            if (probablePrime) {
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


