package L06DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by Martin on 2/26/2017.
 */
public class Pr09House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int roof = n - n / 2;
        int stars = (n % 2 == 0) ? 2 : 1;

        String baseLine = "|" + new String(new char[n - 2]).replace('\0', '*') + "|";

        for (int i = 0; i < n; i++) {
            if (i < roof) {
                System.out.println(repeatStr("-", (n - stars) / 2) +
                        repeatStr("*", stars) +
                        repeatStr("-", (n - stars) / 2));
                stars += 2;
            } else {
                System.out.println(baseLine);
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
