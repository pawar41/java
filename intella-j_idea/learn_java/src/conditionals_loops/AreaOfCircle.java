package conditionals_loops;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner inputRadius = new Scanner(System.in);
        double radius, area;
        float pi = 3.14f;

        System.out.print("Enter the radius of the circle : ");
        radius = inputRadius.nextDouble();

        area = (radius * radius) * pi;
        System.out.println("Area of the Circle with radius " + radius + " is " + area + " square units." );
    }
}
