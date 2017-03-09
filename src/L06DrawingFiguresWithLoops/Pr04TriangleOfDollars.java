package L06DrawingFiguresWithLoops;

/**
 * Created by Martin on 2/26/2017.
 */

import java.util.Scanner;

public class Pr04TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String line = "";
            for (int j = 0; j < i; j++) {
                line += "$ ";
            }
            System.out.println(line.trim());
        }
    }
}
