package Exams.ProgrammingBasicsExamJuly17;

import java.util.Scanner;

/**
 * Created by Martin on 23.02.2017.
 */
public class Ex04BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        int targetYear = Integer.parseInt(scanner.nextLine());

        int age = 18;

        for (int i = 1800; i <= targetYear; i++) {
            money -= 12000.0;
            if (i % 2 == 1) {
                money -= 50.0 * age;
            }
            age++;
        }

        if (money >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.%n", money);
        } else {
            System.out.printf("He will need %.2f dollars to survive.%n", -money);
        }
    }
}
