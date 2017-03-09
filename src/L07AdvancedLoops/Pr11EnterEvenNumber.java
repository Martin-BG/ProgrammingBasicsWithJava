package L07AdvancedLoops;

import java.util.Scanner;

/**
 * Напишете програма, която въвежда четно число. Ако потребителят въведе грешно число
 * (нечетно число или стринг, който не е цяло число), трябва да му излиза съобщение за грешка и да въвежда отново.
 */

public class Pr11EnterEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        boolean invalidInput = true;
        do {
            try {
                num = Integer.parseInt(scanner.nextLine());
                if (num % 2 == 0) {
                    invalidInput = false;
                } else {
                    System.out.println("The number is not even.");
                }
            } catch (Exception e) {
                System.out.println("Invalid number!");
            }
        } while (invalidInput);

        System.out.printf("Even number entered: %d%n", num);
    }
}
