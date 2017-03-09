package L06DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by Martin on 2/25/2017.
 */
public class Pr06RhombusOfStarsStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();

        int spaces = n;

        for (int i = 0; i < n * 2 - 1; i++) {
            if (i < n) {
                spaces--;
            } else {
                spaces++;
            }

            for (int j = 0; j < spaces; j++) {
                sb.append(" ");
            }

            for (int j = 0; j < n - spaces; j++) {
                sb.append("* ");
            }

            System.out.println(sb);

            sb.setLength(0);
        }
    }
}
