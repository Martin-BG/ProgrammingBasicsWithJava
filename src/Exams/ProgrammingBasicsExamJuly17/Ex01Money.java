package Exams.ProgrammingBasicsExamJuly17;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/233#0
 */

public class Ex01Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bitcoins = Double.parseDouble(scanner.nextLine());
        double yuans = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double moneyInLeva = 1168d * bitcoins + yuans * 0.15d * 1.76d;
        double moneyInEuro = moneyInLeva / 1.95d;
        moneyInEuro *= (100.0d - commission) / 100.0d;

        // Hacks to make output C#-like for 100/100 score in Judge
        int moneyInEuroInt = (int)moneyInEuro;
        int digits = 0;

        if(moneyInEuroInt == 0)
        {
            digits = -1;
        } else {
            while (moneyInEuroInt / 10 > 0) {
                digits++;
                moneyInEuroInt /= 10;
            }
        }

        String format = "0." + new String(new char[14-digits]).replace("\0", "#");
        DecimalFormat df = new DecimalFormat(format);

        System.out.println(df.format(moneyInEuro));
    }
}
