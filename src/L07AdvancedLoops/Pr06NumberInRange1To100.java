package L07AdvancedLoops;

import java.util.Scanner;

/**
 * Напишете програма, която въвежда цяло положително число n в диапазона [1…100].
 * При въвеждане на число извън посочения диапазон, да се отпечата съобщение за грешка
 * и потребителят да се подкани да въведе ново число
 */

public class Pr06NumberInRange1To100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Еnter a number in the range [1...100]: ");

        int num = Integer.parseInt(scanner.nextLine());
        while (num < 1 || num > 100) {
            System.out.println("Invalid number!");
            num = Integer.parseInt(scanner.nextLine());
        }

        System.out.printf("The number is: %d%n", num);

    }
}
