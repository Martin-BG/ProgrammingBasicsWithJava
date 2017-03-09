package L05Loops;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Martin on 2/18/2017.
 */
public class Pr11OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double oddMin = Double.MAX_VALUE;
        double oddMax = Double.MIN_VALUE;
        double oddSum = 0;
        double evenMin = Double.MAX_VALUE;
        double evenMax = Double.MIN_VALUE;
        double evenSum = 0;

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                double oddNum = Double.parseDouble(scanner.nextLine());

                if (i == 0) {
                    oddMax = oddNum;
                    oddMin = oddNum;
                } else {
                    if (oddNum > oddMax) {
                        oddMax = oddNum;
                    }
                    if (oddNum < oddMin) {
                        oddMin = oddNum;
                    }
                }
                oddSum += oddNum;
            } else {
                double evenNum = Double.parseDouble(scanner.nextLine());

                if (i == 1) {
                    evenMax = evenNum;
                    evenMin = evenNum;
                } else {
                    if (evenNum > evenMax) {
                        evenMax = evenNum;
                    }
                    if (evenNum < evenMin) {
                        evenMin = evenNum;
                    }
                }
                evenSum += evenNum;
            }
        }

        DecimalFormat df = new DecimalFormat("0.###");
        System.out.printf("OddSum=%s,%n", df.format(oddSum));
        if (n > 0) {
            System.out.printf("OddMin=%s,%n", df.format(oddMin));
            System.out.printf("OddMax=%s%n", df.format(oddMax));
        } else {
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No");
        }

        System.out.printf("EvenSum=%s,%n", df.format(evenSum));
        if (n > 1) {
            System.out.printf("EvenMin=%s,%n", df.format(evenMin));
            System.out.printf("EvenMax=%s%n", df.format(evenMax));
        } else {
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        }
    }
}
