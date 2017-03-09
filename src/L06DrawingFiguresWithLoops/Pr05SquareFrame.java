package L06DrawingFiguresWithLoops;

/**
 * Created by Martin on 2/26/2017.
 */

import java.util.Scanner;

public class Pr05SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String dashes = "";
        for (int i = 0; i < n - 2; i++) {
            dashes += "- ";
        }
        String headerFooterLines = "+ " + dashes + "+";
        String middleLines = "| " + dashes + "|";

        System.out.println(headerFooterLines);
        for (int i = 0; i < n - 2; i++) {
            System.out.println(middleLines);
        }
        System.out.println(headerFooterLines);
    }

}