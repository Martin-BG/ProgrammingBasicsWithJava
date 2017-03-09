package L02SimpleCalculations;

import java.util.Scanner;

/**
 * Created by Martin on 1/22/2017.
 */
public class Pr12CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        double ratioUSD = 1.79549d;
        double ratioEUR = 1.95583d;
        double ratioGBP = 2.53405d;
        String fromCurrency = scanner.nextLine();
        String toCurrency = scanner.nextLine();
        switch (fromCurrency) {
            case "USD":
                money *= ratioUSD;
                break;
            case "EUR":
                money *= ratioEUR;
                break;
            case "GBP":
                money *= ratioGBP;
                break;
            default:
                break;
        }

        switch (toCurrency) {
            case "USD":
                money /= ratioUSD;
                break;
            case "EUR":
                money /= ratioEUR;
                break;
            case "GBP":
                money /= ratioGBP;
                break;
            default:
                break;
        }

        System.out.printf("%.2f %s", money, toCurrency);
    }
}
