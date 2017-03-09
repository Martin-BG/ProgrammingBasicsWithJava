package Exams.ProgrammingBasicsExamAugust28;

/**
 * Created by Martin on 2/26/2017.
 */

import java.util.Scanner;

public class Ex02Company {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hoursNeeded = Integer.parseInt(scanner.nextLine());
        int daysGiven = Integer.parseInt(scanner.nextLine());
        int employeesOverTime = Integer.parseInt(scanner.nextLine());

        int totalWorkHours = (int) (8.0 * 0.9 * daysGiven + 2.0 * employeesOverTime * daysGiven);

        if (hoursNeeded > totalWorkHours) {
            System.out.printf("Not enough time!%d hours needed.", hoursNeeded - totalWorkHours);
        } else {
            System.out.printf("Yes!%d hours left.", totalWorkHours - hoursNeeded);
        }
    }
}
