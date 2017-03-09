package L04ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by martin on 14.02.17.
 */
public class Pr09DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayIndex = Integer.parseInt(scanner.nextLine());

        switch (dayIndex) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
