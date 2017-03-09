package L06DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by Martin on 2/26/2017.
 */
public class Ex02Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int columns = 2 * n - 1;

        char[] oddLine = new char[columns];
        char[] evenLine = new char[columns];
        char[] centerLine = new char[columns];

        for (int i = 0; i < columns; i++) {
            oddLine[i] = '*';
            evenLine[i] = '-';
            centerLine[i] = ' ';
        }

        oddLine[n] = '/';
        oddLine[n - 1] = ' ';
        oddLine[n - 2] = '\\';
        evenLine[n] = '/';
        evenLine[n - 1] = ' ';
        evenLine[n - 2] = '\\';
        centerLine[n - 1] = '@';

        int rows = 2 * n - 3;
        int center = rows / 2;

        for (int i = 0; i < rows; i++) {
            if (i == center) {
                System.out.println(centerLine);
                oddLine[n] = '\\';
                oddLine[n - 2] = '/';
                evenLine[n] = '\\';
                evenLine[n - 2] = '/';
            } else if (i % 2 == 0) {
                System.out.println(oddLine);
            } else {
                System.out.println(evenLine);
            }
        }
    }
}
