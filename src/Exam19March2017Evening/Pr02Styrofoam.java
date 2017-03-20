package Exam19March2017Evening;

import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/501#1
 */
public class Pr02Styrofoam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double area = Double.parseDouble(scanner.nextLine());
        double windowsArea = Integer.parseInt(scanner.nextLine());
        double styrofoamPacketM2 = Double.parseDouble(scanner.nextLine());
        double styrofoamPacketPrice = Double.parseDouble(scanner.nextLine());

        double workArea = (area - windowsArea * 2.4d) * 1.1d;

        int packetsNeeded = (int) Math.ceil(workArea / styrofoamPacketM2);

        double cost = packetsNeeded * styrofoamPacketPrice;

        if (budget >= cost) {
            System.out.printf("Spent: %.2f%n", cost);
            System.out.printf("Left: %.2f%n", budget - cost);
        } else {
            System.out.printf("Need more: %.2f%n", cost - budget);
        }
    }
}
