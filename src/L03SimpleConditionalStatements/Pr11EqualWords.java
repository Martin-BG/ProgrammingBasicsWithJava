package L03SimpleConditionalStatements;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Martin on 2/5/2017.
 */
public class Pr11EqualWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordOne = scanner.nextLine().toLowerCase(Locale.ROOT);
        String wordTwo = scanner.nextLine().toLowerCase(Locale.ROOT);

        if (wordOne.equals(wordTwo)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
