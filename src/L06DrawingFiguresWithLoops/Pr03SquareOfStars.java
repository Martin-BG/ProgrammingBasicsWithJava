package L06DrawingFiguresWithLoops;

/**
 * Created by Martin on 2/26/2017.
 */

import java.util.Scanner;

public class Pr03SquareOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        char[] line = new char[n * 2 - 1];

        for (int i = 0; i < n * 2 - 1; i++) {
            if (i % 2 == 1) {
                line[i] = ' ';
            } else {
                line[i] = '*';
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(line);
        }
    }
}
