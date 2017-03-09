package Exams.ProgrammingBasicsExamNovemberMorning;

import java.util.Scanner;

/**
 * Created by Martin on 22.02.2017.
 */
public class Ex01Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceSkumria = Double.parseDouble(scanner.nextLine());
        double priceCaca = Double.parseDouble(scanner.nextLine());
        double pricePalamud = priceSkumria * 1.6;
        double priceSafrid = priceCaca * 1.8;
        double priceMidi = 7.5;

        double amountPalamud = Double.parseDouble(scanner.nextLine());
        double amountSafrid = Double.parseDouble(scanner.nextLine());
        int amountMidi = Integer.parseInt(scanner.nextLine());

        double totalCost = pricePalamud * amountPalamud + priceSafrid * amountSafrid + priceMidi * amountMidi;

        System.out.printf("%.2f%n", totalCost);
    }
}
