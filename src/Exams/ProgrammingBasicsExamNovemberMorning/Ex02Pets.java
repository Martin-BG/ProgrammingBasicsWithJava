package Exams.ProgrammingBasicsExamNovemberMorning;

import java.util.Scanner;

/**
 * Created by Martin on 22.02.2017.
 */
public class Ex02Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int totalFoodKg = Integer.parseInt(scanner.nextLine());
        double dogEatsKg = Double.parseDouble(scanner.nextLine());
        double catEatsKg = Double.parseDouble(scanner.nextLine());
        double turtleEatsKg = Double.parseDouble(scanner.nextLine()) / 1000.0;

        double foodNeeded = (dogEatsKg + catEatsKg + turtleEatsKg) * days;

        if (foodNeeded <= totalFoodKg) {
            System.out.printf("%d kilos of food left.%n", (int) (totalFoodKg - foodNeeded));
        } else {
            System.out.printf("%d more kilos of food are needed.", (int) Math.ceil(foodNeeded - totalFoodKg));
        }
    }
}
