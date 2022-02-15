import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle();
        circles[1] = new ComparableCircle(3.6);
        circles[2] = new ComparableCircle(3.5, "indigo", false);

        System.out.println("Pre-sorted: ");
        for (ComparableCircle circle : circles)
            System.out.println(circle);

        Arrays.sort(circles);

        System.out.println("After-sorted: ");
        for (ComparableCircle circle : circles)
            System.out.println(circle);




        Circle[] circles2 = new Circle[3];
        circles2[0] = new Circle(3.6);
        circles2[1] = new Circle();
        circles2[2] = new Circle(3.5, "indigo", false);

        System.out.println("Pre-sorted:");
        for (Circle circle : circles2) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles2, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles2) {
            System.out.println(circle);
        }
    }
}
