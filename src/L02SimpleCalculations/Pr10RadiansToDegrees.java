package L02SimpleCalculations;

import java.util.Scanner;

/**
 * Created by Martin on 1/22/2017.
 */
public class Pr10RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180 / Math.PI;
        System.out.println(Math.round(degrees));
    }
}
