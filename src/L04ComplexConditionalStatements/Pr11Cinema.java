package L04ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by martin on 14.02.17.
 */
public class Pr11Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieType = scanner.nextLine().toLowerCase().intern();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double totalSeats = rows * columns;
        double ticketPrice;
        switch (movieType) {
            case "premiere":
                ticketPrice = 12.0d;
                break;
            case "normal":
                ticketPrice = 7.5d;
                break;
            case "discount":
                ticketPrice = 5.0d;
                break;
            default:
                ticketPrice = -1.0d;
                break;
        }

        if (ticketPrice > 0.0d) {
            System.out.printf("%.2f leva%n", ticketPrice * totalSeats);
        } else {
            System.out.println("error");
        }
    }
}
