package Exams.ProgrammingBasicsExamAugust28;

import java.util.Scanner;

/**
 * Created by Martin on 2/26/2017.
 */
public class Ex04Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int doctors = 7;

        int untreatedPatients = 0;
        int treatedPatients = 0;

        for (int i = 1; i <= days; i++) {
            if (i % 3 == 0) {
                if (untreatedPatients > treatedPatients) {
                    doctors++;
                }
            }

            int patients = Integer.parseInt(scanner.nextLine());

            if (patients > doctors) {
                untreatedPatients += patients - doctors;
            }

            treatedPatients += Math.min(patients, doctors);
        }

        System.out.printf("Treated patients: %d.%n", treatedPatients);
        System.out.printf("Untreated patients: %d.%n", untreatedPatients);
    }
}
