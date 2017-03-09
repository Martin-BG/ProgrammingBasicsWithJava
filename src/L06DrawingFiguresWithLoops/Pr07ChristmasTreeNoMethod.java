package L06DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by Martin on 2/26/2017.
 */
public class Pr07ChristmasTreeNoMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        char[] line = new char[n * 2 + 3];
        for (int i = 0; i < line.length; i++) {
            line[i] = ' ';
        }
        line[n + 1] = '|';

        for (int i = 0; i <= n; i++) {
            if ( i > 0 ) {
                line[n - i] = '*';
                line[n + 2 + i] = '*';
            }
            System.out.println(line);
        }
    }
}
