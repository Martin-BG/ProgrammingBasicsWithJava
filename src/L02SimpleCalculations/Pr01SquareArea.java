package L02SimpleCalculations;

import java.util.Scanner;

/**
 * Created by Martin on 1/21/2017.
 */
public class Pr01SquareArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int a = Integer.parseInt(scanner.nextLine());
        int area = a * a;
        System.out.printf("Square = %d%n", area);
    }
}
