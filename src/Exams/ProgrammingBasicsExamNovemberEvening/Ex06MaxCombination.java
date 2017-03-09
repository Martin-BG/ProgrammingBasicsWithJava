package Exams.ProgrammingBasicsExamNovemberEvening;

import java.util.Scanner;

/**
 * Created by Martin on 23.02.2017.
 */
public class Ex06MaxCombination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int maxCombinations = Integer.parseInt(scanner.nextLine());

        int counterComb = 0;

        for (int i = startNum; i <= endNum; i++) {
            if (counterComb >= maxCombinations) {
                break;
            }
            for (int j = startNum; j <= endNum; j++) {
                System.out.printf("<%d-%d>", i, j);
                counterComb++;
                if (counterComb >= maxCombinations) {
                    break;
                }
            }
        }
    }
}
