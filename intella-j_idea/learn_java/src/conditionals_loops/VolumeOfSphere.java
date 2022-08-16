package conditionals_loops;

import java.util.Scanner;

//volume = (4/3) × π × r³
// 4.186 * ( r * r * r)
public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner inputSphere = new Scanner(System.in);
        double volume, radius;

        System.out.print("Enter radius of the Sphere: ");
        radius = inputSphere.nextDouble();

        volume = 4.186 * (radius * radius * radius);
        System.out.print("The volume of the Sphere is " + volume + " cube units.");
    }
}
