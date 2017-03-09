package L06DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by Martin on 2/26/2017.
 */
public class Pr10DiamondNoMethod {
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

        String headerFooterLine = new String(new char[dashes]).replace("\0", "-") +
                new String(new char[2 - n % 2]).replace("\0", "*") +
                new String(new char[dashes]).replace("\0", "-");

        for (int i = 0; i < lines; i++) {
            if (i == 0 || i == lines - 1) {
                System.out.println(headerFooterLine);
            } else {
                System.out.println(new String(new char[dashes]).replace("\0", "-") + "*" +
                        new String(new char[n - 2 - dashes * 2]).replace("\0", "-") + "*" +
                        new String(new char[dashes]).replace("\0", "-"));
            }

            if (i < middleLine) {
                dashes--;
            } else {
                dashes++;
            }
        }
    }
}
