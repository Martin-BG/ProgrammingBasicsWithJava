package Exams.ProgrammingBasicsExamNovemberMorning;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Martin on 22.02.2017.
 */
public class Ex04SoftUniCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        int byCar = 0;
        int byMicroBus = 0;
        int bySmallBus = 0;
        int byBus = 0;
        int byTrain = 0;
        int totalStudents = 0;

        for (int i = 0; i < groups; i++) {
            int students = Integer.parseInt(scanner.nextLine());
            totalStudents += students;

            if (students <= 5) {
                byCar += students;
            } else if (students <= 12) {
                byMicroBus += students;
            } else if (students <= 25) {
                bySmallBus += students;
            } else if (students <= 40) {
                byBus += students;
            } else {
                byTrain += students;
            }
        }

        DecimalFormat df = new DecimalFormat("0.00%");
        System.out.println(df.format((double) byCar / totalStudents));
        System.out.println(df.format((double) byMicroBus / totalStudents));
        System.out.println(df.format((double) bySmallBus / totalStudents));
        System.out.println(df.format((double) byBus / totalStudents));
        System.out.println(df.format((double) byTrain / totalStudents));
    }
}
