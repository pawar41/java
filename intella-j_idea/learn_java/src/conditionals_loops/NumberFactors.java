package conditionals_loops;

import java.util.Scanner;

public class NumberFactors {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        int number;

        System.out.print("Enter the number to find factors: ");
        number = inputNumber.nextInt();

        for (int i = 1; i <= number; i++) {
            if ((number % i) == 0)
                System.out.println(i);
        }
    }
}
