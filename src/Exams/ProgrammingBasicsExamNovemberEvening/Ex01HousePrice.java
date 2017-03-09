package Exams.ProgrammingBasicsExamNovemberEvening;

import java.util.Scanner;

/**
 * Created by Martin on 23.02.2017.
 */
public class Ex01HousePrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double smallestRoomArea = Double.parseDouble(scanner.nextLine());
        double kitchenArea = Double.parseDouble(scanner.nextLine());
        double pricePerM2 = Double.parseDouble(scanner.nextLine());

        double bathroomArea = smallestRoomArea / 2;
        double middleRoomArea = smallestRoomArea * 1.1;
        double biggestRoomArea = middleRoomArea * 1.1;

        double totalArea = (smallestRoomArea + kitchenArea + bathroomArea + middleRoomArea + biggestRoomArea) * 1.05;

        System.out.printf("%.2f%n", totalArea * pricePerM2);
    }
}
