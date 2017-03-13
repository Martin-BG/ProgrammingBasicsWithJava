package Exams.ProgrammingBasicsExam24;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/181#0
 */

public class Ex01TilesRepair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int areaSide = Integer.parseInt(scanner.nextLine());
        double tileSideA = Double.parseDouble(scanner.nextLine());
        double tileSideB = Double.parseDouble(scanner.nextLine());
        double benchSideA = Double.parseDouble(scanner.nextLine());
        double benchSideB = Double.parseDouble(scanner.nextLine());

        double totalWorkArea = areaSide * areaSide - benchSideA * benchSideB;
        double oneTileArea = tileSideA * tileSideB;

        double tilesNeeded = totalWorkArea / oneTileArea;

        double timeNeeded = tilesNeeded * 0.2d;

        System.out.println(doubleToStringCSharpLike(tilesNeeded));
        System.out.println(doubleToStringCSharpLike(timeNeeded));
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
