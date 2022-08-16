package conditionals_loops;

import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner inputRectangle = new Scanner(System.in);
        double side, perimeter;

        System.out.print("Enter side of a square: ");
        side = inputRectangle.nextDouble();

        perimeter = side * 4;
        System.out.print("Perimeter of square is " + perimeter + " units.");
    }
}
