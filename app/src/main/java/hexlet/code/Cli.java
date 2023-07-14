package hexlet.code;

import java.util.Scanner;
public class Cli {
    public static void greetingsCli() {
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello, " + name);
        sc.close();
    }
}
