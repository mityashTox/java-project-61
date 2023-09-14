package hexlet.code.games;

public interface Game {
    void printGameRule();

    void startGame();

    String[][] askQuestions();
}

