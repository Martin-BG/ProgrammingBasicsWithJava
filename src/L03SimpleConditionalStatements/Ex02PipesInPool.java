package L03SimpleConditionalStatements;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Martin on 1/22/2017.
 */
public class Ex02PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double V = (double) Integer.parseInt(scanner.nextLine());
        double P1 = (double) Integer.parseInt(scanner.nextLine());
        double P2 = (double) Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double volume = (P1 + P2) * hours;
        if (volume <= V) {
            System.out.printf("The pool is %d%% full. Pipe 1: %d%%. Pipe 2: %d%%.%n",
                    (int) (volume / V * 100d), (int) (P1 * 100d / (P1 + P2)), (int) (P2 * 100d / (P1 + P2)));
        } else {
            DecimalFormat df = new DecimalFormat("0.##");
            System.out.printf("For %s hours the pool overflows with %s liters.%n",
                    df.format(hours), df.format(volume - V));
        }
    }
}
