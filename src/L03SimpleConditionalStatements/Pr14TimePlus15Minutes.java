package L03SimpleConditionalStatements;

import java.util.Scanner;

/**
 * Created by Martin on 2/6/2017.
 */
public class Pr14TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        min += 15;

        if (min > 59) {
            hour++;
            min -= 60;
        }

        if (hour > 23) {
            hour -= 24;
        }

        System.out.printf("%d:%02d", hour, min);
    }
}
