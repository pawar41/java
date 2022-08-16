package conditionals_loops;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner inputTriangle = new Scanner(System.in);
        double base, height, area;

        System.out.print("Enter base & height of a Triangle: ");
        base = inputTriangle.nextDouble();
        height = inputTriangle.nextDouble();

        area = 0.5 * base * height;
        System.out.print("The area of the Triangle with base & height " + base + " and " + height + " is " + area + " square units.");
    }
}
