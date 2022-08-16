package conditionals_loops;
//  V = A * H / 3
//  A = b * h
import java.util.Scanner;

public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner inputPiryamid = new Scanner(System.in);
        double volume, triangleBase, triangleHeight, triangleArea, height;

        System.out.print("Enter base and height of base triangle of piryamid: ");
        triangleHeight = inputPiryamid.nextDouble();
        triangleBase = inputPiryamid.nextDouble();

        System.out.print("Enter Height of the piryamid: ");
        height = inputPiryamid.nextDouble();

        triangleArea = 0.5 * triangleBase * triangleHeight;
        volume = triangleArea * height / 3;
        System.out.print("Area of Piryamid is " + volume + " cube unit.");
    }
}
