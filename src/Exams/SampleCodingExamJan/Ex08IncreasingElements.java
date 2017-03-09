package Exams.SampleCodingExamJan;

import java.util.Scanner;

/**
 * Created by Martin on 22.02.2017.
 */
public class Ex08IncreasingElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int longestIncreasingSequence = 0;
        int currentIncreasingSequence = 0;
        int lastNumber = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());

            if (num > lastNumber) {
                currentIncreasingSequence++;
            } else {
                if (currentIncreasingSequence > longestIncreasingSequence) {
                    longestIncreasingSequence = currentIncreasingSequence;
                }
                currentIncreasingSequence = 1;
            }

            lastNumber = num;
        }

        if (currentIncreasingSequence > longestIncreasingSequence) {
            longestIncreasingSequence = currentIncreasingSequence;
        }

        System.out.println(longestIncreasingSequence);
    }
}
