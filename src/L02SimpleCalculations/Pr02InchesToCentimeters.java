package L02SimpleCalculations;

import java.util.Scanner;

/**
 * Created by Martin on 1/21/2017.
 */
public class Pr02InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("inches = ");
        double inches = Double.parseDouble(scanner.nextLine());
        double ratio = 2.54d;
        double centimeters = inches * ratio;
        System.out.println("centimeters = " + centimeters);
    }
}
