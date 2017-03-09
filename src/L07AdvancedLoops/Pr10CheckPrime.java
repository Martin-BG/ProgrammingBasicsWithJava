package L07AdvancedLoops;

import java.util.Scanner;

/**
 * Напишете програма, която въвежда цяло число n и проверява дали е просто число
 * (дали се дели само на себе си и на единица). Да се отпечата “Prime” или “Not prime”.
 */

public class Pr10CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        boolean isPrime = true;

        if (num < 2) {
            isPrime = false;
        } else {
            int upperLimit = (int) Math.sqrt(num);

            for (int i = 2; i <= upperLimit; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.printf("%s%n", isPrime ? "Prime" : "Not Prime");
    }
}
