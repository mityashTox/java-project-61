package hexlet.code;

import java.util.Scanner;
public class Cli {
    private static String name;
    public static void greetingsCli() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("Hello, " + name + "!");
    }

    public static String getName() {
        return name;
    }
}
