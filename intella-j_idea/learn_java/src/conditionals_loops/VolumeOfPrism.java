package conditionals_loops;

import java.util.Scanner;

//Volume = 0.5 * Base * Height * Length
public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner inputPrism = new Scanner(System.in);
        double volume, base, height, length;

        System.out.print("Enter base, height and length of prism: ");
        base = inputPrism.nextDouble();
        height = inputPrism.nextDouble();
        length = inputPrism.nextDouble();

        volume = 0.5 * base * height * length;
        System.out.print("The Volume of Prism is " + volume + " cube units.");
    }
}
