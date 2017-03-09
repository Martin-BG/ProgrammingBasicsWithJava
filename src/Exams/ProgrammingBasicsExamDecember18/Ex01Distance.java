package Exams.ProgrammingBasicsExamDecember18;

import java.util.Scanner;

/**
 * Created by Martin on 24.02.2017.
 */
public class Ex01Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startSpeed = Integer.parseInt(scanner.nextLine());
        double time1 = Integer.parseInt(scanner.nextLine()) / 60.0;
        double time2 = Integer.parseInt(scanner.nextLine()) / 60.0;
        double time3 = Integer.parseInt(scanner.nextLine()) / 60.0;

        double totalTripDistance = startSpeed * time1;
        totalTripDistance += startSpeed * 1.1 * time2;
        totalTripDistance += startSpeed * 1.1 * 0.95 * time3;

        System.out.printf("%.2f%n", totalTripDistance);
    }
}
