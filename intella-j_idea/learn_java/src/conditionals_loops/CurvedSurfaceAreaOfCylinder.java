package conditionals_loops;
// surface area = 2 pi r*r
// body area = 2 pi r h
// curvedSurfaceArea = surfaceArea + bodyArea;
import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner inputSurfaceAreaCylinder = new Scanner(System.in);
        double circleArea, bodyArea, curvedSurfaceArea, radius, height;

        System.out.print("Enter radius and height of Cylinder: ");
        radius = inputSurfaceAreaCylinder.nextDouble();
        height = inputSurfaceAreaCylinder.nextDouble();

        circleArea = 2 * 3.14 * (radius * radius);
        bodyArea = 2 * 3.14 * radius * height;
        curvedSurfaceArea = circleArea + bodyArea;
        System.out.print("Curved surface area of Cylinder is " + curvedSurfaceArea + " square units.");
    }
}
