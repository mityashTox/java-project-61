package hexlet.code;

public class Utils {
    private static final int UPPER_BOUND = 1000;
    public static int makeRandomValue() {

        return (int) (Math.random() * UPPER_BOUND);
    }
}
