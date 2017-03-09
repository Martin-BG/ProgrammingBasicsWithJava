package Exams.ProgrammingBasicsExamDecember18;

import java.util.Scanner;

/**
 * Created by Martin on 24.02.2017.
 */
public class Ex02ChangeTiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double savings = Double.parseDouble(scanner.nextLine());
        double floorWidth = Double.parseDouble(scanner.nextLine());
        double floorLength = Double.parseDouble(scanner.nextLine());
        double tileTriangleSide = Double.parseDouble(scanner.nextLine());
        double tileTriangleHeight = Double.parseDouble(scanner.nextLine());
        double pricePerTile = Double.parseDouble(scanner.nextLine());
        double workerWage = Double.parseDouble(scanner.nextLine());

        double floorArea = floorWidth * floorLength;
        double tileArea = tileTriangleHeight * tileTriangleSide / 2;

        int tilesNeeded = (int) Math.ceil(floorArea / tileArea) + 5;

        double totalCost = pricePerTile * tilesNeeded + workerWage;

        if (savings < totalCost) {
            System.out.printf("You'll need %.2f lv more.%n", totalCost - savings);
        } else {
            System.out.printf("%.2f lv left.%n", savings - totalCost);
        }
    }
}
