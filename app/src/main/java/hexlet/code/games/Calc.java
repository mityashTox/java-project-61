package hexlet.code.games;


public class Calc implements Game {
    private static final int UPPER_BOUND = 1000;
    private static final String GAME_RULE = "What is the result of the expression?";
    private static String[][] stackQuestion = new  String[3][2];

    @Override
    public void printGameRule() {
        System.out.println(GAME_RULE);
    }

    @Override
    public String[][] askQuestions() {
        for (int i = 0; i < stackQuestion.length; i++){
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
            stackQuestion[i][0] = randomValue1 + " " + expression + " " + randomValue2;
            stackQuestion[i][1] = Integer.toString(answer);
        }
        return stackQuestion;
    }


}
