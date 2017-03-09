package L02SimpleCalculations;

import java.util.Scanner;

/**
 * Created by Martin on 1/22/2017.
 */
public class Pr11USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549d;
        System.out.printf("%.2f BGN", bgn);
    }
}
