package L05Loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03SmartLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washerPrice = Double.parseDouble(scanner.nextLine());
        int oneToyPrice = Integer.parseInt(scanner.nextLine());

        int moneyFromPresents = 0;

        for (int i = 1; i <= age / 2; i++) {
            moneyFromPresents += (i * 10) - 1;
        }

        int toysFromPresents = age / 2 + age % 2;

        double totalMoney = moneyFromPresents + toysFromPresents * oneToyPrice;

        DecimalFormat df = new DecimalFormat("0.00");

        if (washerPrice <= totalMoney) {
            System.out.println("Yes! " + df.format(totalMoney - washerPrice));
        } else {
            System.out.println("No! " + df.format(washerPrice - totalMoney));
        }
    }
}
