package Exams.ExamPreparationI;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/453#0
 */
public class Ex01SinoTheWalker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime time = LocalTime.parse(scanner.nextLine(), formatter);
        long stepsToHome = Long.parseLong(scanner.nextLine());
        long secondsPerStep = Long.parseLong(scanner.nextLine());

        time = time.plusSeconds(stepsToHome * secondsPerStep);

        System.out.printf("Time Arrival: %s%n", time.format(formatter));
    }
}
