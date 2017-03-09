package Exams.ProgrammingBasicsExamNovemberMorning;

import java.util.Scanner;

/**
 * Created by Martin on 22.02.2017.
 */
public class Ex06Battles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pokemonsPlayer1 = Integer.parseInt(scanner.nextLine());
        int pokemonsPlayer2 = Integer.parseInt(scanner.nextLine());
        int maxBattles = Integer.parseInt(scanner.nextLine());

        int counterBattles = 0;

        for (int i = 1; i <= pokemonsPlayer1; i++) {
            for (int j = 1; j <= pokemonsPlayer2; j++) {
                if (counterBattles < maxBattles) {
                    counterBattles++;
                    System.out.printf("(%d <-> %d) ", i, j);
                } else {
                    break;
                }
            }
        }
    }
}
