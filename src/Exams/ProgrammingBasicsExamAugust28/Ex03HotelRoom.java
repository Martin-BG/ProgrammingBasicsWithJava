package Exams.ProgrammingBasicsExamAugust28;

/**
 * Created by Martin on 2/26/2017.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine().toLowerCase();
        int nights = Integer.parseInt(scanner.nextLine());

        double costForOneNightApartment = 0;
        double costForOneNightStudio = 0;
        double studioDiscount = 1.0;
        double apartmentDiscount = (nights > 14) ? 0.9 : 1.0;

        switch (month) {
            case "may":
            case "october":
                costForOneNightStudio = 50;
                costForOneNightApartment = 65;
                if (nights > 7 && nights <= 14) {
                    studioDiscount = 0.95;
                } else if (nights > 14) {
                    studioDiscount = 0.7;
                }
                break;
            case "june":
            case "september":
                costForOneNightStudio = 75.2;
                costForOneNightApartment = 68.7;
                if (nights > 14) {
                    studioDiscount = 0.8;
                }
                break;
            case "july":
            case "august":
                costForOneNightStudio = 76;
                costForOneNightApartment = 77;
                break;
            default:
                break;
        }

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.printf("Apartment: %s lv.%n",
                df.format(costForOneNightApartment * apartmentDiscount * nights));
        System.out.printf("Studio: %s lv.%n",
                df.format(costForOneNightStudio * studioDiscount * nights));
    }
}
