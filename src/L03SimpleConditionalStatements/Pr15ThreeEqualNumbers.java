package L03SimpleConditionalStatements;

import java.util.Scanner;

/**
 * Created by Martin on 2/6/2017.
 */
public class Pr15ThreeEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        double num3 = Double.parseDouble(scanner.nextLine());

        if ((num1 == num2) && (num1 == num3)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
