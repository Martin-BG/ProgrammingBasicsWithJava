package Exam19March2017Evening;

import java.util.Scanner;

/**
 * Exam
 */
public class Pr05Parallelepiped {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String headerDots = repeatStr(".", 2 * n + 1);
        String headerPlus = "+" + repeatStr("~", n - 2) + "+";
        System.out.println(headerPlus + headerDots);

        String centerFigure = "\\" + repeatStr("~", n - 2) + "\\";
        for (int i = 0; i <= 2 * n; i++) {
            String rightSideDots = repeatStr(".", 2 * n - i);
            String centerDots = repeatStr(".", i );
            System.out.println("|" + centerDots + centerFigure + rightSideDots);
        }

        String sideFigure = "|" + repeatStr("~", n - 2) + "|";
        for (int i = 0; i <= 2 * n; i++) {
            String leftSideDots = repeatStr(".", i );
            String centerDots = repeatStr(".", 2 * n - i );
            System.out.println(leftSideDots + "\\" + centerDots + sideFigure);
        }

        System.out.println(headerDots + headerPlus);
    }

    private static String repeatStr(String strToRepeat, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(strToRepeat);
        }

        return sb.toString();
    }
}
