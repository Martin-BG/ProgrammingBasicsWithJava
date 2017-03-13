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

        System.out.println(doubleToStringCSharpLike(moneyInEuro));
    }

    private static String doubleToStringCSharpLike(double value) {
        int digits = 15;

        if (Math.abs(value) >= 1.0d) {
            digits -= Double.toString(value).split("[.,]")[0].length();
        }

        String format = "0." + new String(new char[digits]).replace("\0", "#");
        DecimalFormat df = new DecimalFormat(format);

        return df.format(value);
    }
}
