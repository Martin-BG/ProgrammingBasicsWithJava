package Exams.ProgrammingBasicsExamFebruary21;

import java.util.Scanner;

/**
 * Created by Martin on 2/27/2017.
 */
public class Ex05SaltAndPepper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long number = Long.parseLong(scanner.nextLine());
        System.out.println(Long.toBinaryString(number));
        char[] binChars = new char[64];
        binChars = Long.toBinaryString(number).toCharArray();
        System.out.println(new String(binChars));
        System.out.println(binChars.length);

/*        while (true) {
            String[] input = scanner.nextLine().toLowerCase().split(" ");
            if ("end".equals(input[0])) {
                break;
            } else {
                addSpices(Integer.parseInt(input[1]), input[0], binChars);
            }
        }*/
        System.out.println(Long.parseLong(new String(binChars), 2));
    }

    private static void addSpices(int step, String spice, char[] binChars) {
        char setChar = "salt".equals(spice) ? '0' : '1';
        for (int i = binChars.length; i >= 0; i--) {
            if (i % step == 0) {
                binChars[i] = setChar;
            }
        }
    }

}
