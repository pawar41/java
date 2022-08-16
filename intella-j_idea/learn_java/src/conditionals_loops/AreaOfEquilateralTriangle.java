package conditionals_loops;

import java.util.Scanner;
// Area = 0.4325 * (side * side)
public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner inputTriangle = new Scanner(System.in);
        double area, side;

        System.out.print("Enter side of an Equilateral Trianglr: ");
        side = inputTriangle.nextDouble();

        area = 0.4325 * (side * side);
        System.out.print("Area of Equilateral Triangle with side " + side + " is " + area + " square units.");
    }
}
