package hexlet.code.games;

public class Prime implements Game{
    private static final int UPPER_BOUND = 1000;
    private static final int PRIME_VALUE_2 = 2;
    private static final int PRIME_VALUE_3 = 3;
    private static final int PRIME_VALUE_5 = 5;
    private static final int PRIME_VALUE_7 = 7;
    private static final String gameRule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    @Override
    public void printGameRule() {
        System.out.println(gameRule);
    }

    @Override
    public String askQuestion() {
        int value = (int) (Math.random() * UPPER_BOUND) + PRIME_VALUE_2;
        System.out.println("Question: " + value);
        System.out.print("Your answer: ");
        if (value == PRIME_VALUE_2 || value == PRIME_VALUE_3 || value == PRIME_VALUE_5 || value == PRIME_VALUE_7) {
            return "yes";
        }
        if (value % PRIME_VALUE_2 != 0 && value % PRIME_VALUE_3 != 0 && value % PRIME_VALUE_5 != 0 && value % PRIME_VALUE_7 != 0) {
            return "yes";
        }
        return "no";
    }
}