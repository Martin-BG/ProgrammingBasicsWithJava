package Exams.ProgrammingBasicsExam7May;

import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/540#4
 */
public class Ex05Crown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());

        int width = 2 * N - 1;

        String headerLine = "@" + repeatStr(" ", N - 2) + "@" + repeatStr(" ", N - 2) + "@";
        String secondLine = "**" + repeatStr(" ", N - 3) + "*" + repeatStr(" ", N - 3) + "**";

        System.out.println(headerLine);
        System.out.println(secondLine);
        String centerSegment;
        String middleLine;
        for (int i = 0; i < N / 2; i++) {
            if (i < N / 2 - 1) {
                centerSegment = repeatStr(".", 1 + 2 * i);
            } else {
                centerSegment = repeatStr("*", (width - N - 4 - 1) / 2) + "."
                        + repeatStr("*", (width - N - 4 - 1) / 2);
            }
            if (i < N / 2 - 2) {
                centerSegment = "*" + centerSegment + "*";
            }
            middleLine = "*" + repeatStr(".", 1 + i) + "*" + repeatStr(" ", N - 5 - i * 2)
                    + centerSegment + repeatStr(" ", N - 5 - i * 2) + "*"
                    + repeatStr(".", 1 + i) + "*";

            System.out.println(middleLine);
        }

        String footerLines = repeatStr("*", width);
        System.out.println(footerLines);
        System.out.println(footerLines);
    }

    private static String repeatStr(String strToRepeat, int count) {
        if (count <= 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(strToRepeat);
        }

        return sb.toString();
    }
}
