package hexlet.code.games;

public class Even implements Game {
    private static final int UPPER_BOUND = 10000;
    private static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    @Override
    public void printGameRule() {
        System.out.println(GAME_RULE);
    }

    @Override
    public String askQuestion() {
        int randomValue = (int) (Math.random() * UPPER_BOUND);
        System.out.println("Question: " + randomValue);
        System.out.print("Your answer: ");
        return randomValue % 2 == 0 ? "yes" : "no";
    }


}
