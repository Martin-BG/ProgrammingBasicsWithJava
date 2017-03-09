package L03SimpleConditionalStatements;

import java.util.Scanner;

/**
 * Created by Martin on 2/5/2017.
 */
public class Pr12SpeedInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = Double.parseDouble(scanner.nextLine());

        if (speed <= 10.0d) {
            System.out.println("slow");
        } else if (speed <= 50.0d) {
            System.out.println("average");
        } else if (speed <= 150.0d) {
            System.out.println("fast");
        } else if (speed <= 1000.0d) {
            System.out.println("ultra fast");
        } else {
            System.out.println("extremely fast");
        }
    }
}
