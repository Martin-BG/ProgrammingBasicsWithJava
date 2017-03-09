package Exams.ProgrammingBasicsExamNovemberEvening;

import java.util.Scanner;

/**
 * Created by Martin on 23.02.2017.
 */
public class Ex02FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countMagnolii = Integer.parseInt(scanner.nextLine());
        int countZyumbyuli = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int countCactuses = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double income = (3.25 * countMagnolii + 4.0 * countZyumbyuli + 3.5 * countRoses + 8.0 * countCactuses) * 0.95;

        if (income >= giftPrice) {
            System.out.printf("She is left with %d leva.%n", (int) (income - giftPrice));
        } else {
            System.out.printf("She will have to borrow %d leva.", (int) Math.ceil(giftPrice - income));
        }
    }
}
