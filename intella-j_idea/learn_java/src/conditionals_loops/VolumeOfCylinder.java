package conditionals_loops;

import java.util.Scanner;

//volume = 3.14 * (radius * radius) * height
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner inputCylinder = new Scanner(System.in);
        double volume, radius, height;
        System.out.print("Input height and radius of Cylinder: ");
        height = inputCylinder.nextDouble();
        radius = inputCylinder.nextDouble();

        volume = 3.14 * (radius * radius) * height;
        System.out.print("The volume of Cylinder is " + volume + " cube units.");
    }
}
