package L02SimpleCalculations;


import java.util.Scanner;

/**
 * Created by Martin on 1/22/2017.
 */
public class Pr08TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double area = a * h / 2d;
        System.out.printf("Triangle area = %.2f", area);
    }
}
