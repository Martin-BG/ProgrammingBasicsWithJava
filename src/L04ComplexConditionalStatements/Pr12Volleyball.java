package L04ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by Martin on 2/11/2017.
 */
public class Pr12Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yearType = scanner.nextLine().toLowerCase();
        int holidays = Integer.parseInt(scanner.nextLine());
        int weekendsAtHome = Integer.parseInt(scanner.nextLine());

        double playDays = weekendsAtHome;
        playDays += (double) (48 - weekendsAtHome) * 0.75d;
        playDays += (double) holidays * 2.0d / 3.0d;

        if ("leap".equals(yearType)) {
            playDays *= 1.15d;
        }
        System.out.println((int) playDays);
    }
}
