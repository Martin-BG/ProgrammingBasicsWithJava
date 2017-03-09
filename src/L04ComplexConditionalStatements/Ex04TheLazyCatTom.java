package L04ComplexConditionalStatements;

import java.util.Scanner;

public class Ex04TheLazyCatTom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int holidays = Integer.parseInt(scanner.nextLine());
        int playTime = 127 * holidays + 63 * (365 - holidays);

        if (playTime > 30000) {
            System.out.println("Tom will run away");
            int minutes = playTime - 30000;
            System.out.printf("%d hours and %d minutes more for play%n", minutes / 60, minutes % 60);
        } else {
            System.out.println("Tom sleeps well");
            int minutes = 30000 - playTime;
            System.out.printf("%d hours and %d minutes less for play%n", minutes / 60, minutes % 60);
        }
    }
}