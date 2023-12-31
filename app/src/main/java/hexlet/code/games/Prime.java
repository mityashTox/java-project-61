package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.math.BigInteger;

public final class Prime implements Game {
    private static final int ARRAY_SIZE_1 = 3;
    private static final int ARRAY_SIZE_2 = 2;
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
        String[][] stackQuestion = new  String[ARRAY_SIZE_1][ARRAY_SIZE_2];
        for (int i = 0; i < stackQuestion.length; i++) {
            int value = Utils.makeRandomValue() + PRIME_VALUE_2;
            BigInteger bigInteger = BigInteger.valueOf(value);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(value));
            String answer = probablePrime ? "yes" : "no";
            stackQuestion[i][0] = Integer.toString(value);
            stackQuestion[i][1] = answer;
        }
        return stackQuestion;
    }
}


