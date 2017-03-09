package L06DrawingFiguresWithLoops;

/**
 * Created by Martin on 2/26/2017.
 */

import java.util.Scanner;

public class Pr02RectangleOfNxNStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String line = new String(new char[n]).replace('\0', '*');

        for (int i = 0; i < n; i++) {
            System.out.println(line);
        }
    }
}
