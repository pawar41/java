package conditionals_loops;

import java.util.Scanner;

public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner inputTriangle = new Scanner(System.in);
        double base, height, area;

        System.out.print("Enter side of an Isosceles Triangle: ");
        base = inputTriangle.nextDouble();
        height = Math.sqrt((base * base) - ((base/2) * (base/2)));

        area = 0.5 * base * height;
        System.out.print("The area of the Isosceles Triangle with base " + base + " is " + area + " square units.");
    }
}
