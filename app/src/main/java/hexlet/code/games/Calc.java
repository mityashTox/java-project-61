package hexlet.code.games;

public class Calc implements Game{
    private static final int UPPER_BOUND = 1000;
    private static final String gameRule = "What is the result of the expression?";

    @Override
    public void printGameRule() {
        System.out.println(gameRule);
    }

    @Override
    public String askQuestion() {
        int randomValue1 = (int) (Math.random() * UPPER_BOUND);
        int randomValue2 = (int) (Math.random() * UPPER_BOUND);
        int answer;
        String expression;
        if (Math.random() * 10 < 3) {
            answer = randomValue1 + randomValue2;
            expression = "+";
        } else if (Math.random() * 10 >= 3 && Math.random() * 10 < 6) {
            answer = randomValue1 - randomValue2;
            expression = "-";
        } else {
            answer = randomValue1 * randomValue2;
            expression = "*";
        }
        System.out.println("Question: " + randomValue1 + " " + expression + " " + randomValue2);
        System.out.print("Your answer: ");
        return Integer.toString(answer);
    }

}
