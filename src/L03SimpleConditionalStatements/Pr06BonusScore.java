package L03SimpleConditionalStatements;

import java.util.Scanner;

/**
 * Created by Martin on 2/4/2017.
 */
public class Pr06BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double bonusPoints = 0.0d;
        if(number > 1000) {
            bonusPoints = number * 0.1d;
        } else if (number < 100) {
            bonusPoints += 5.0d;
        } else {
            bonusPoints = number * 0.2d;
        }

        if (number % 2 == 0) {
            bonusPoints += 1.0d;
        } else if(number %10 == 5) {
            bonusPoints += 2.0d;
        }

        System.out.println(bonusPoints);
        System.out.println(bonusPoints + number);
    }
}
