package L05Loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex02DivisionWithNoReminder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int divideOn2 = 0;
        int divideOn3 = 0;
        int divideOn4 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num % 2 == 0) {
                divideOn2++;
            }
            if (num % 3 == 0) {
                divideOn3++;
            }
            if (num % 4 == 0) {
                divideOn4++;
            }
        }

        DecimalFormat df = new DecimalFormat("0.00%");
        System.out.println(df.format((double) divideOn2 / n));
        System.out.println(df.format((double) divideOn3 / n));
        System.out.println(df.format((double) divideOn4 / n));
    }
}
