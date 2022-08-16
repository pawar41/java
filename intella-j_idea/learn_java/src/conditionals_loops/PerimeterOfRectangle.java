package conditionals_loops;

import java.util.Scanner;
//perimeter = (length + width) * 2
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner inputRectangle = new Scanner(System.in);
        double length, width, perimeter;

        System.out.print("Enter length and width of a rectangle: ");
        length = inputRectangle.nextDouble();
        width = inputRectangle.nextDouble();

        perimeter = (length + width) * 2;
        System.out.print("Perimeter of rectangle is " + perimeter + " units.");
    }
}
