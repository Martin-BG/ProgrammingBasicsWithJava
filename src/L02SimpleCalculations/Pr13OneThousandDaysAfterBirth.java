package L02SimpleCalculations;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by Martin on 1/22/2017.
 */
public class Pr13OneThousandDaysAfterBirth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(scanner.nextLine(), formatter);
        System.out.println(birthDate.plusDays(999).format(formatter));
    }
}
