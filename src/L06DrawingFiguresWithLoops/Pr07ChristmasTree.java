package L06DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by Martin on 2/26/2017.
 */
public class Pr07ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int spaces = n;
        for (int i = 0; i <= n; i++) {
            System.out.println(repeatStr(" ", spaces) + repeatStr("*", n - spaces)
                    + " | " + repeatStr("*", n - spaces));
            spaces--;
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
