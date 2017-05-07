package Exams.ProgrammingBasicsExam7May;

import java.util.Scanner;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/540#2
 */
public class Ex03SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double cost;
        String sport;

        switch (season) {
            case "Winter": {
                if ("mixed".equals(groupType)) {
                    cost = 10.0d;
                    sport = "Ski";
                } else {
                    cost = 9.6d;
                    if ("boys".equals(groupType)) {
                        sport = "Judo";
                    } else {
                        sport = "Gymnastics";
                    }
                }
            } break;
            case "Spring": {
                if ("mixed".equals(groupType)) {
                    cost = 9.5d;
                    sport = "Cycling";
                } else {
                    cost = 7.2d;
                    if ("boys".equals(groupType)) {
                        sport = "Tennis";
                    } else {
                        sport = "Athletics";
                    }
                }
            } break;
            default: {
                if ("mixed".equals(groupType)) {
                    cost = 20d;
                    sport = "Swimming";
                } else {
                    cost = 15d;
                    if ("boys".equals(groupType)) {
                        sport = "Football";
                    } else {
                        sport = "Volleyball";
                    }
                }
            } break;
        }

        cost *= nights;
        cost *= students;

        if (students >= 50) {
            cost *= 0.5d;
        } else if (students >= 20) {
            cost *= 0.85d;
        } else if (students >= 10) {
            cost *= 0.95d;
        }

        System.out.printf("%s %.2f lv.", sport, cost);
    }
}
