package L06DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by Martin on 2/26/2017.
 */
public class Ex01DrawFort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int middleSection = Math.max(0, n - 4 + n % 2);
        String northTowers = "/" + new String(new char[n / 2]).replace('\0', '^') + '\\';
        String northWall = northTowers + new String(new char[middleSection]).replace('\0', '_') + northTowers;

        char[] middleLines = new char[2 * n];
        for (int i = 1; i < 2 * n - 1; i++) {
            middleLines[i] = ' ';
        }
        middleLines[0] = '|';
        middleLines[2 * n - 1] = '|';

        String southTowers = "\\" + new String(new char[n / 2]).replace('\0', '_') + "/";
        String southWall = southTowers + new String(new char[middleSection]).replace('\0', ' ') + southTowers;

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println(northWall);
            } else if (i == n - 1) {
                System.out.println(southWall);
            } else if (i == n - 2) {
                for (int j = 0; j < middleSection; j++) {
                    middleLines[n - middleSection / 2 + j] = '_';
                }
                System.out.println(middleLines);
            } else {
                System.out.println(middleLines);
            }
        }
    }
}
