package Exams.ExamPreparationI;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://judge.softuni.bg/Contests/Practice/Index/453#3
 */
public class Ex04WinningTicketRegExSolution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tickets = scanner.nextLine().split("([\\s*]|[,*]){1,}");

        Pattern r = Pattern.compile("([@]{6,}|[#]{6,}|[$]{6,}|[\\^]{6,})");

        for (String ticket : tickets) {
            if (ticket.length() == 0) {
                continue;
            } else if (ticket.length() != 20) {
                System.out.println("invalid ticket");
                continue;
            }

            Matcher firstMatch = r.matcher(ticket.substring(0, 10));
            Matcher secondMatch = r.matcher(ticket.substring(10));

            if (firstMatch.find() && secondMatch.find()
                    && (firstMatch.group().charAt(0) == secondMatch.group().charAt(0))) {

                char winChar = firstMatch.group().charAt(0);
                int longestSequence = Math.min(firstMatch.group().length(), secondMatch.group().length());

                if (longestSequence == 10) {
                    System.out.printf("ticket \"%s\" - %d%c Jackpot!%n", ticket, longestSequence, winChar);
                } else {
                    System.out.printf("ticket \"%s\" - %d%c%n", ticket, longestSequence, winChar);
                }
            } else {
                System.out.printf("ticket \"%s\" - no match%n", ticket);
            }
        }
    }
}