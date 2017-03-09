package L04ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by martin on 14.02.17.
 */

public class Pr06PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double x1 = Double.parseDouble(scanner.nextLine());
        Double y1 = Double.parseDouble(scanner.nextLine());
        Double x2 = Double.parseDouble(scanner.nextLine());
        Double y2 = Double.parseDouble(scanner.nextLine());
        Double x = Double.parseDouble(scanner.nextLine());
        Double y = Double.parseDouble(scanner.nextLine());

        if (((x.equals(x1) || x.equals(x2)) && y1 <= y && y <= y2) ||
                ((y.equals(y1) || y.equals(y2)) && x1 <= x && x <= x2)) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }

    }
}
