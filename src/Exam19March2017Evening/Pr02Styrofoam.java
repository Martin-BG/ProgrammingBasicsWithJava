package Exam19March2017Evening;

import java.util.Scanner;

/**
 * Exam
 */
public class Pr02Styrofoam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double area = Double.parseDouble(scanner.nextLine());
        double windowsArea = Integer.parseInt(scanner.nextLine()) * 2.4d;
        double styrofoamPacketM2 = Double.parseDouble(scanner.nextLine());
        double styrofoamPacketPrice = Double.parseDouble(scanner.nextLine());

        double workArea = (area - windowsArea) * 1.1d;

        int packetsNeeded = (int) Math.ceil(workArea / styrofoamPacketM2);

        double price = packetsNeeded * styrofoamPacketPrice;

        if (budget >= price) {
            System.out.printf("Spent: %.2f%n", price);
            System.out.printf("Left: %.2f%n", budget - price);
        } else {
            System.out.printf("Need more: %.2f%n", price - budget);
        }
    }
}
