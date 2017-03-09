package L03SimpleConditionalStatements;

import java.util.Scanner;

/**
 * Created by martin on 06.02.17.
 */
public class Ex01TransportPrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = Integer.parseInt(scanner.nextLine());
        String dayOrNight = scanner.nextLine();
        double cost = 0.0d;

        if (distance >= 100) {
            cost = 0.06d * distance;
        } else if (distance >= 20) {
            cost = 0.09d * distance;
        } else if (distance >= 0) {
            if ("day".equalsIgnoreCase(dayOrNight)) {
                cost = 0.70d + (0.79d * distance);
            } else {
                cost = 0.70d + (0.9d * distance);
            }
        }

        System.out.printf("%.2f", cost);
    }
}
