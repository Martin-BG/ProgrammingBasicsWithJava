package L06DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by Martin on 2/26/2017.
 */
public class Pr10Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int lines = n;
        int dashes = n / 2;
        int middleLine = n / 2;

        if (n % 2 == 0) {
            lines--;
            dashes--;
            middleLine--;
        }

        String headerFooterLine = repeatStr("-", dashes) +
                repeatStr("*", 2 - n % 2) +
                repeatStr("-", dashes);

        for (int i = 0; i < lines; i++) {
            if (i == 0 || i == lines - 1) {
                System.out.println(headerFooterLine);
            } else {
                System.out.println(repeatStr("-", dashes) + "*" +
                        repeatStr("-", n - 2 - dashes * 2) + "*" +
                        repeatStr("-", dashes));
            }

            if (i < middleLine) {
                dashes--;
            } else {
                dashes++;
            }
        }
    }

    private static String repeatStr(String strToRepeat, int count) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(strToRepeat);
        }

        return sb.toString();
    }
}
