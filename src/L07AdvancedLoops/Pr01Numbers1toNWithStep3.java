package L07AdvancedLoops;

import java.util.Scanner;

/**
 * Напишете програма, която въвежда число n и отпечатва числата от 1 до n през 3 (със стъпка 3). 
 */

public class Pr01Numbers1toNWithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i+= 3) {
            System.out.println(i);
        }
    }
}
