package conditionals_loops;

import java.util.Scanner;

// Area Of Parallelogram = base * height
public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner inputParallelogram = new Scanner(System.in);
        double base, height, area;

        System.out.print("Enter base and height of a parallelogram: ");
        base = inputParallelogram.nextDouble();
        height = inputParallelogram.nextDouble();

        area = base * height;
        System.out.print("Area of Parallelogram with height and base " + height + " and " + base + " is " + area);
    }
}
