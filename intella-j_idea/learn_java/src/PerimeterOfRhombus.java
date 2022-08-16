import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner inputRectangle = new Scanner(System.in);
        double side, perimeter;

        System.out.print("Enter side of a rhombus: ");
        side = inputRectangle.nextDouble();

        perimeter = side * 4;
        System.out.print("Perimeter of Rhombus is " + perimeter + " units.");
    }
}
