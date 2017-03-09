package L05Loops;

import java.util.Scanner;

/**
 * Created by Martin on 2/18/2017.
 */
public class Pr07LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
            leftSum += Integer.parseInt(scanner.nextLine());
        }

        for (int i = 0; i < n; i++) {
            rightSum += Integer.parseInt(scanner.nextLine());
        }

        int diff = Math.abs(leftSum - rightSum);

        if (diff == 0) {
            System.out.printf("Yes, sum = %d%n", leftSum);
        } else {
            System.out.printf("No, diff = %d%n", diff);
        }
    }
}
