package L03SimpleConditionalStatements;

import java.util.Scanner;

/**
 * Created by Martin on 2/4/2017.
 */
public class Pr01ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        if (grade >= 5.5d) {
            System.out.println("Excellent!");
        }
    }
}
