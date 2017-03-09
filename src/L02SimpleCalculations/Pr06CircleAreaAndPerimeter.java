package L02SimpleCalculations;

import java.util.Scanner;

/**
 * Created by Martin on 1/21/2017.
 */
public class Pr06CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter circle radius. r = ");
        double r = Double.parseDouble(scanner.nextLine());
        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
