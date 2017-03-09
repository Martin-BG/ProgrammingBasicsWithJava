package L04ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by martin on 14.02.17.
 */

public class Pr05InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        if (number != 0 && (number < 100 || number > 200)) {
            System.out.println("invalid");
        }
    }
}