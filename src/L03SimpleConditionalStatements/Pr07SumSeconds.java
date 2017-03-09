package L03SimpleConditionalStatements;

import java.util.Scanner;

/**
 * Created by Martin on 2/4/2017.
 */
public class Pr07SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int player1 = Integer.parseInt(scanner.nextLine());
        int player2 = Integer.parseInt(scanner.nextLine());
        int player3 = Integer.parseInt(scanner.nextLine());
        int totalTime = player1 + player2 + player3;
        int mins = totalTime / 60;
        int secs = totalTime % 60;
        System.out.printf("%d:%02d", mins, secs);
    }
}
