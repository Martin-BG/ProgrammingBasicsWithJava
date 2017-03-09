package Exams.ProgrammingBasicsExamNovemberMorning;

import java.util.Scanner;

/**
 * Created by Martin on 22.02.2017.
 */
public class Ex03Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int adults = Integer.parseInt(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        String transportType = scanner.nextLine().toLowerCase().intern();

        double transportationCost = 0.0;

        switch (transportType) {
            case "train":
                transportationCost = 24.99 * adults + 14.99 * students;
                if (adults + students >= 50) {
                    transportationCost *= 0.5;
                }
                break;
            case "bus":
                transportationCost = 32.50 * adults + 28.50 * students;
                break;
            case "boat":
                transportationCost = 42.99 * adults + 39.99 * students;
                break;
            case "airplane":
                transportationCost = 70.0 * adults + 50.0 * students;
                break;
            default:
                break;
        }

        double totalCost = (82.99 * nights + transportationCost * 2) * 1.1;

        System.out.printf("%.2f%n", totalCost);
    }
}
