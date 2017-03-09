package L07AdvancedLoops;

import java.util.Scanner;

/**
 * Напишете програма, която въвежда число n и отпечатва всички числа ≤ n от редицата:
 * 1, 3, 7, 15, 31, …. Всяко следващо число се изчислява като предишното число * 2 + 1
 */
public class Pr05Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int num = 1;
        while (num <= n) {
            System.out.println(num);
            num = num * 2 + 1;
        }
    }
}
