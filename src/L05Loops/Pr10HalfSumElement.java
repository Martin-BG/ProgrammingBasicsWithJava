package L05Loops;

import java.util.Scanner;

/**
 * Created by Martin on 2/18/2017.
 */
public class Pr10HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
            if (num > maxNum) {
                maxNum = num;
            }
        }

        sum -= maxNum;

        int diff = Math.abs(sum - maxNum);

        if (diff == 0) {
            System.out.printf("Yes%nSum = %d%n", sum);
        } else {
            System.out.printf("No%nDiff = %d%n", diff);
        }
    }
}
