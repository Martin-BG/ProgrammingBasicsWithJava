package L06DrawingFiguresWithLoops;

/**
 * Created by Martin on 2/26/2017.
 */
public class Pr01RectangleOf10x10Stars {
    public static void main(String[] args) {
        String lineOfStars = new String(new char[10]).replace('\0', '*');
        for (int i = 0; i < 10; i++) {
            System.out.println(lineOfStars);
        }
    }
}