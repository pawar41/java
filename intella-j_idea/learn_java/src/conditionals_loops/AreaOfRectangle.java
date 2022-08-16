package conditionals_loops;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner inputRectangle = new Scanner(System.in);
        double length, width, area;

        System.out.print(" Enter length and width of a rectangle: ");
        length = inputRectangle.nextDouble();
        width = inputRectangle.nextDouble();

        area = length * width;
        System.out.print("The area of rectangle with leangth and width " + length + " and " + width + " is " + area + " square units.");
    }
}
