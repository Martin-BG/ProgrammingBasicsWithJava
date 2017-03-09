package L01FirstStepsInCoding;

/**
 * Created by Martin on 1/14/2017.
 */

import java.util.Scanner;

public class Pr06SquareOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        if (n >= 2 && n <= 100) {
            System.out.println(new String(new char[n]).replace("\0", "*"));
            String lines = "*" + new String(new char[n - 2]).replace("\0", " ") + "*";
            for (int i = 0; i < n - 2; i++) {
                System.out.println(lines);
            }
            System.out.println(new String(new char[n]).replace("\0", "*"));
        }
    }
}

//    private static String newString(char c, int n) {
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < n; i++) {
//            builder.append(c);
//        }
//        return builder.toString();
//    }