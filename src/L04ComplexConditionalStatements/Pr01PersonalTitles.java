package L04ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by martin on 14.02.17.
 */
public class Pr01PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double age = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine().toLowerCase();

        if (age < 16) {
            if ("m".equals(sex)) {
                System.out.println("Master");
            } else {
                System.out.println("Miss");
            }
        } else {
            if ("m".equals(sex)) {
                System.out.println("Mr.");
            } else {
                System.out.println("Ms.");
            }
        }
    }
}
