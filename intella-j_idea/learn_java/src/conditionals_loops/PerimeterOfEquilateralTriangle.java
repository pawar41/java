package conditionals_loops;

import java.util.Scanner;
//perimeter = 3 * side
public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner inputTriangle = new Scanner(System.in);
        double perimeter, side;

        System.out.print("Enter side of an Equilateral Trianglr: ");
        side = inputTriangle.nextDouble();

        perimeter = 3 * side;
        System.out.print("Perimeter of Equilateral Triangle with side " + side + " is " + perimeter + " units.");
    }
}
