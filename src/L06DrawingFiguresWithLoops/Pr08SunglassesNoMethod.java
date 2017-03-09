package L06DrawingFiguresWithLoops;

import java.util.Scanner;

/**
 * Created by Martin on 2/26/2017.
 */
public class Pr08SunglassesNoMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String starsSection = new String(new char[2 * n]).replace('\0', '*');
        String glassSection = "*" + new String(new char[2 * n - 2]).replace('\0', '/') + '*';
        String middleEmptySection = new String(new char[n]).replace('\0', ' ');
        String middleFrameSection = new String(new char[n]).replace('\0', '|');

        String headerFooterLine = starsSection + middleEmptySection + starsSection;
        String frameLine = glassSection + middleFrameSection + glassSection;
        String glassesLine = glassSection + middleEmptySection + glassSection;

        int frameN = n / 2 - ((n % 2 == 0) ? 1 : 0);

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                System.out.println(headerFooterLine);
            } else if (i == frameN) {
                System.out.println(frameLine);
            } else {
                System.out.println(glassesLine);
            }
        }
    }
}
