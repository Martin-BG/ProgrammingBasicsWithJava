package L03SimpleConditionalStatements;

import java.util.Scanner;

/**
 * Created by Martin on 2/4/2017.
 */
public class Pr04GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.printf("Greater number: %d%n", (num1 > num2) ? num1 : num2);
    }
}
