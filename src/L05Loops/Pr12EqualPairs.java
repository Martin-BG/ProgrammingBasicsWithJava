package L05Loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Pr12EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double lastPairSum = 0;
        double maxDiff = Double.MIN_VALUE;
        boolean allPairsAreEqual = true;

        for (int i = 0; i < n; i++) {
            double num1 = Double.parseDouble(scanner.nextLine());
            double num2 = Double.parseDouble(scanner.nextLine());
            double sum = num1 + num2;

            if (i == 0) {
                lastPairSum = sum;
            } else {
                if (sum != lastPairSum) {
                    allPairsAreEqual = false;
                }

                maxDiff = Math.max(maxDiff, Math.abs(lastPairSum - sum));
                lastPairSum = sum;
            }
        }

        DecimalFormat df = new DecimalFormat("0.###");

        if (allPairsAreEqual) {
            System.out.println("Yes, value=" + df.format(lastPairSum));
        } else {
            System.out.println("No, maxdiff=" + df.format(maxDiff));
        }
    }
}
