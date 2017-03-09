package L05Loops;

import java.util.Scanner;

/**
 * Created by Martin on 2/18/2017.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = "blah";
        String str2 = "blah";
        String inp1 = scanner.nextLine();
        String inp2 = scanner.nextLine().intern();

        System.out.println( str1 == str2);
        System.out.println( str1 == inp1);
        System.out.println( str1 == inp2);

    }
}
