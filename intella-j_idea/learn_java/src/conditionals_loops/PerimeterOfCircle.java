package conditionals_loops;

import java.util.Scanner;
//perimeter = 6.28 * radius
public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner inputRadius = new Scanner(System.in);
        double radius, perimeter;

        System.out.print("Enter the radius of the circle : ");
        radius = inputRadius.nextDouble();

        perimeter = 6.28 * radius;
        System.out.println("Perimeter of the Circle with radius " + radius + " is " + perimeter + " units.");
    }
}
