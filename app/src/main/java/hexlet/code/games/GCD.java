package hexlet.code.games;

public class GCD implements Game {
    private static final int UPPER_BOUND = 1000;
    private static final String GAME_RULE = "Find the greatest common divisor of given numbers.";


    @Override
    public void printGameRule() {
        System.out.println(GAME_RULE);
    }

    @Override
    public String askQuestion() {
        int randomValue1 = (int) (Math.random() * UPPER_BOUND);
        int randomValue2 = (int) (Math.random() * UPPER_BOUND);
        int max = Math.max(randomValue1, randomValue2);
        int min = Math.min(randomValue1, randomValue2);
        int divisor = 0;

        while (min != 0) {
            divisor = min;
            min = max % min;
            max = divisor;
        }
        System.out.println("Question: " + randomValue1 + " " + randomValue2);
        System.out.print("Your answer: ");
        return Integer.toString(divisor);
    }
}
