package L05Loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex01Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int range0To199 = 0;
        int range200To399 = 0;
        int range400To599 = 0;
        int range600To799 = 0;
        int range800To1000 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num >= 0 && num <= 199) {
                range0To199++;
            } else if (num >= 200 && num <= 399) {
                range200To399++;
            } else if (num >= 400 && num <= 599) {
                range400To599++;
            } else if (num >= 600 && num <= 799) {
                range600To799++;
            } else if (num >= 800 && num <= 1000) {
                range800To1000++;
            }
        }

        DecimalFormat df = new DecimalFormat("0.00%");

        System.out.println(df.format((double) range0To199 / n));
        System.out.println(df.format((double) range200To399 / n));
        System.out.println(df.format((double) range400To599 / n));
        System.out.println(df.format((double) range600To799 / n));
        System.out.println(df.format((double) range800To1000 / n));
    }
}
