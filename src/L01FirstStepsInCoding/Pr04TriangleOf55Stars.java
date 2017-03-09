package L01FirstStepsInCoding;

/**
 * Created by Martin on 1/14/2017.
 */
public class Pr04TriangleOf55Stars {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(new String(new char[i]).replace("\0", "*"));
        }
    }
}
