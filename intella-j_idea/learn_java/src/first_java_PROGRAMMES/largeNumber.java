package first_java_PROGRAMMES;

//Take 2 numbers as input and print the largest number

import java.util.Scanner;

public class largeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number1, number2, numberLarge, numberSmall;

        System.out.print("Enter first number: ");
        number1 = input.nextLong();

        System.out.print("Enter second number: ");
        number2 = input.nextLong();

        if (number1 > number2) {
            numberLarge = number1;
            numberSmall = number2;
            System.out.println("Number " + numberLarge + " is greater than " + numberSmall + ".");
        } else if (number2 > number1) {
            numberLarge = number2;
            numberSmall = number1;
            System.out.println("Number " + numberLarge + " is greater than " + numberSmall + ".");

        } else {
            numberLarge = 0;
            numberSmall = 0;
            System.out.println("Both the numbers " + number1 + " and " + number2 + " are equal. ");
        }
    }
}
