package L04ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by Martin on 2/11/2017.
 */
public class Pr02SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine().toLowerCase();
        String city = scanner.nextLine().toLowerCase();
        double quantity = Double.parseDouble(scanner.nextLine());
        double cost = 0.0d;

        if ("coffee".equals(product)) {
            if ("sofia".equals(city)) {
                cost = 0.50d;
            } else if ("plovdiv".equals(city)) {
                cost = 0.40d;
            } else if ("varna".equals(city)) {
                cost = 0.45d;
            }
        } else if ("water".equals(product)) {
            if ("sofia".equals(city)) {
                cost = 0.80d;
            } else if ("plovdiv".equals(city)) {
                cost = 0.70d;
            } else if ("varna".equals(city)) {
                cost = 0.70d;
            }
        } else if ("beer".equals(product)) {
            if ("sofia".equals(city)) {
                cost = 1.20d;
            } else if ("plovdiv".equals(city)) {
                cost = 1.15d;
            } else if ("varna".equals(city)) {
                cost = 1.10d;
            }
        } else if ("sweets".equals(product)) {
            if ("sofia".equals(city)) {
                cost = 1.45d;
            } else if ("plovdiv".equals(city)) {
                cost = 1.30d;
            } else if ("varna".equals(city)) {
                cost = 1.35d;
            }
        } else if ("peanuts".equals(product)) {
            if ("sofia".equals(city)) {
                cost = 1.60d;
            } else if ("plovdiv".equals(city)) {
                cost = 1.50d;
            } else if ("varna".equals(city)) {
                cost = 1.55d;
            }
        }

        System.out.printf("%.2f%n", cost * quantity);
    }
}
