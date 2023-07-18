package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Scanner;

public class Even implements Game{
    private static final int UPPER_BOUND = 10000;
    private static final String gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    @Override
    public void printGameRule() {
        System.out.println(gameRule);
    }

    @Override
    public String askQuestion() {
        int randomValue = (int) (Math.random() * UPPER_BOUND);
        System.out.println("Question: " + randomValue);
        System.out.print("Your answer: ");
        return randomValue % 2 == 0 ? "yes" : "no";
    }


}
