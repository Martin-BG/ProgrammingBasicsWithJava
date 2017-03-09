package L02SimpleCalculations;

import java.util.Scanner;

/**
 * Created by Martin on 1/21/2017.
 */
public class Pr03GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}

