package L03SimpleConditionalStatements;

import java.util.Scanner;

/**
 * Created by Martin on 2/5/2017.
 */
public class Pr09PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if ("s3cr3t!P@ssw0rd".equals(input)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
