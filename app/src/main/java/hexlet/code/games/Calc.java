package hexlet.code.games;


import hexlet.code.Engine;
import hexlet.code.Utils;

public final class Calc implements Game {
    private static final int ARRAY_SIZE_1 = 3;
    private static final int ARRAY_SIZE_2 = 2;
    private static final String GAME_RULE = "What is the result of the expression?";
    private static final int NON_RESULT = 0;
    private  final char[] operators = {'+', '-', '*'};

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
        String[][] stackQuestion = new String[ARRAY_SIZE_1][ARRAY_SIZE_2];
        for (int i = 0; i < stackQuestion.length; i++) {
            int randomValue1 = Utils.makeRandomValue();
            int randomValue2 = Utils.makeRandomValue();
            int expression = (int) Math.floor(Math.random() * operators.length);
            int answer = calculate(operators[expression], randomValue1, randomValue2);
            stackQuestion[i][0] = randomValue1 + " " + operators[expression] + " " + randomValue2;
            stackQuestion[i][1] = Integer.toString(answer);
        }
        return stackQuestion;
    }

    private static int calculate(char operator, int number1, int number2) {
        switch (operator) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            default:
                return NON_RESULT;
        }
    }
}
