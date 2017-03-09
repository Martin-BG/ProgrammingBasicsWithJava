package L03SimpleConditionalStatements;

import java.util.Scanner;

/**
 * Created by Martin on 2/6/2017.
 */
public class Pr13AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double area = 0.0d;

        if ("square".equals(figure)) {
            double side = Double.parseDouble(scanner.nextLine());
            area = side * side;
        } else if ("rectangle".equals(figure)) {
            double sideA = Double.parseDouble(scanner.nextLine());
            double sideB = Double.parseDouble(scanner.nextLine());
            area = sideA * sideB;
        } else if ("circle".equals(figure)) {
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * radius * radius;
        } else if ("triangle".equals(figure)) {
            double side = Double.parseDouble(scanner.nextLine());
            double height = Double.parseDouble(scanner.nextLine());
            area = side * height / 2.0d;
        }

        System.out.printf("%.3f", area);
    }
}
