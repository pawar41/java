package conditionals_loops;

import java.util.Scanner;

//area = base * height
public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner inputRhombus = new Scanner(System.in);
        double area, base, height;

        System.out.print("Enter base and height of Rhombus: ");
        base = inputRhombus.nextDouble();
        height = inputRhombus.nextDouble();

        area = base * height;
        System.out.print("Area of Rhombus with height and base " + height + " and " + base + " is " + area + " square units.");
    }
}
