package L06DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by Martin on 2/25/2017.
 */
public class Pr06RhombusOfStarsNoMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int spaces = n;

        for (int i = 0; i < n * 2 - 1; i++) {
            if (i < n) {
                spaces--;
            } else {
                spaces++;
            }

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - spaces; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
