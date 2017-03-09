package L04ComplexConditionalStatements;

import java.util.Scanner;

/**
 * Created by Martin on 2/11/2017.
 */
public class Ex01OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinute = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinute = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMinute;
        int arrivalTime = arrivalHour * 60 + arrivalMinute;
        int diffInMinutes = examTime - arrivalTime;

        if (0 <= diffInMinutes && diffInMinutes <= 30) {
            System.out.println("On time");
        } else if (diffInMinutes < 0) {
            System.out.println("Late");
        } else {
            System.out.println("Early");
        }

        if (diffInMinutes != 0) {
            int absDiffInMin = Math.abs(diffInMinutes);

            if (absDiffInMin < 60) {
                System.out.printf("%d minutes ", absDiffInMin);
            } else {
                System.out.printf("%d:%02d hours ", absDiffInMin / 60, absDiffInMin % 60);
            }

            if (diffInMinutes > 0) {
                System.out.println("before the start");
            } else {
                System.out.println("after the start");
            }
        }
    }
}
