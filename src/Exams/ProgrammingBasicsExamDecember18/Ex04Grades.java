package Exams.ProgrammingBasicsExamDecember18;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Martin on 24.02.2017.
 */
public class Ex04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalStudents = Integer.parseInt(scanner.nextLine());

        int gradesTo299 = 0;
        int gradesTo399 = 0;
        int gradesTo499 = 0;
        int gradesAbove5 = 0;
        double grades = 0;

        for (int i = 0; i < totalStudents; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            grades += grade;
            if (grade <= 2.99) {
                gradesTo299++;
            } else if (grade <= 3.99) {
                gradesTo399++;
            } else if (grade <= 4.99) {
                gradesTo499++;
            } else {
                gradesAbove5++;
            }
        }

        DecimalFormat df = new DecimalFormat("0.00%");
        System.out.printf("Top students: %s%n", df.format((double) gradesAbove5 / totalStudents));
        System.out.printf("Between 4.00 and 4.99: %s%n", df.format((double) gradesTo499 / totalStudents));
        System.out.printf("Between 3.00 and 3.99: %s%n", df.format((double) gradesTo399 / totalStudents));
        System.out.printf("Fail: %s%n", df.format((double) gradesTo299 / totalStudents));
        System.out.printf("Average: %.2f%n", grades / totalStudents);
    }
}
