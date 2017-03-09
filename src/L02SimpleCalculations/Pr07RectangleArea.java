package L02SimpleCalculations;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * Created by Martin on 1/21/2017.
 */
public class Pr07RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double width = Math.abs(x1 - x2);
        double height = Math.abs(y1 - y2);
        System.out.printf("Area = %f%n", width * height);
        System.out.printf("Perimeter = %f%n", 2d * (width + height));
    }
}
