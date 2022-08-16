package conditionals_loops;

import java.util.Scanner;

public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner inputCube = new Scanner(System.in);
        double totalSurfaceArea, surfaceArea, side;

        System.out.print("Enter the side of a cube: ");
        side = inputCube.nextDouble();

        surfaceArea = side * side;
        totalSurfaceArea = surfaceArea * 6;
        System.out.print("Total surface area of Cube is " + totalSurfaceArea + " square units.");
    }
}
