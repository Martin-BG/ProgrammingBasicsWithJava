package L02SimpleCalculations;

import java.util.Scanner;

/**
 * Created by Martin on 1/22/2017.
 */
public class Ex02VegetablesMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int weightVegetables = Integer.parseInt(scanner.nextLine());
        int weightFruits = Integer.parseInt(scanner.nextLine());
        double rateEUR = 1.94d;
        double profit = (priceVegetables * (double) weightVegetables + priceFruits * (double) weightFruits) / rateEUR;
        System.out.printf("%f", profit);
    }
}
