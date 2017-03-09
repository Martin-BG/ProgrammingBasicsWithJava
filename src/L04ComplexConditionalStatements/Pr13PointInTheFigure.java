package L04ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by martin on 30.01.17.
 */
public class Pr13PointInTheFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.nextLine());
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());

        if (isOutside(h, x, y)) {
            System.out.println("outside");
        } else if (isInside(h, x, y)) {
            System.out.println("inside");
        } else {
            System.out.println("border");
        }
    }

    private static boolean isInside(int h, int x, int y) {
        return (((y < h) && (y > 0) && (x > 0) && (x < 3 * h)) ||
                ((y >= h) && (y < 4 * h) && (x > h) && (x < 2 * h)));
    }

    private static boolean isOutside(int h, int x, int y) {
        return ((x < 0) || (y < 0) || (x > 3 * h) || (y > 4 * h) ||
                ((y > h) && ((x < h) || (x > 2 * h))));
    }
}
