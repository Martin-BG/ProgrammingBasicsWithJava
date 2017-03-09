package L03SimpleConditionalStatements;

import java.util.Scanner;

/**
 * Created by Martin on 2/4/2017.
 */
public class Pr03EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
