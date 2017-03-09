package Exams.ProgrammingBasicsExamNovemberEvening;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Martin on 23.02.2017.
 */
public class Ex04Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countCargoes = Integer.parseInt(scanner.nextLine());

        int transpByBus = 0;
        int transpByTruck = 0;
        int transpByTrain = 0;

        for (int i = 0; i < countCargoes; i++) {
            int cargo = Integer.parseInt(scanner.nextLine());

            if (cargo <= 3) {
                transpByBus += cargo;
            } else if (cargo <= 11) {
                transpByTruck += cargo;
            } else {
                transpByTrain += cargo;
            }
        }

        double totalCargo = transpByBus + transpByTruck + transpByTrain;
        double averageCostPerTon = (transpByBus * 200 + transpByTruck * 175 + transpByTrain * 120) / totalCargo;

        System.out.printf("%.2f%n", averageCostPerTon);

        DecimalFormat df = new DecimalFormat("0.00%");

        System.out.println(df.format(transpByBus / totalCargo));
        System.out.println(df.format(transpByTruck / totalCargo));
        System.out.println(df.format(transpByTrain / totalCargo));
    }
}
