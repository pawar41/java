package conditionals_loops;

import java.util.Scanner;
//V = (6.28 * r * h)/3
public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner inputCone = new Scanner(System.in);
        double volume, radius, height;

        System.out.print("Enter radius and height of the cone: ");
        radius = inputCone.nextDouble();
        height = inputCone.nextDouble();

        volume = 1.046 * ( radius * radius) * height;
        System.out.print("The volume of cone is " + volume + " cube units.");
    }
}
