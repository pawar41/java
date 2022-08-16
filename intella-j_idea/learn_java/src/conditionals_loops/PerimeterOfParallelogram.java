package conditionals_loops;

import java.util.Scanner;
//perimeter = (side1 + side2) * 2
public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner inputParallelogram = new Scanner(System.in);
        double side1, side2, perimeter;

        System.out.print("Enter any 2 adjoining sides of parallelogram: ");
        side1 = inputParallelogram.nextDouble();
        side2 = inputParallelogram.nextDouble();

        perimeter = (side1 + side2) * 2;
        System.out.print("Perimeter of Parallelogram is " + perimeter + " units.");
    }
}
