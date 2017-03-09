package Exams.SampleCodingExamJan;

import java.util.Scanner;

/**
 * Created by Martin on 21.02.2017.
 */
public class Ex02Bricks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bricks = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int cartCapacity = Integer.parseInt(scanner.nextLine());

        System.out.println((int)Math.ceil((double) bricks / (workers * cartCapacity)));
    }
}
