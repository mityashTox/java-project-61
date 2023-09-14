package hexlet.code.games;

import hexlet.code.Engine;

import java.math.BigInteger;

public final class Prime implements Game {
    private static final int UPPER_BOUND = 1000;
    private static final int PRIME_VALUE_2 = 2;
    private static final String GAME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

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


