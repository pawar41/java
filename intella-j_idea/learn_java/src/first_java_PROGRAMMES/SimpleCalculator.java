package first_java_PROGRAMMES;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner inputLiteral = new Scanner(System.in);

        double number1 = 0, number2 = 0, answer = 0;
        String operation = "";

        System.out.print("Enter \"Number 1\": ");
        number1 = inputLiteral.nextDouble();
        System.out.print("Enter \"Number 2\": ");
        number2 = inputLiteral.nextDouble();
        System.out.print("Enter the operation to perform (+, -, /, *): ");
        operation = inputLiteral.next();

        System.out.println(operation);

        if (operation.equals("+")){
            answer = number1 + number2;
        } else if (operation.equals("-")) {
            answer = number1 - number2;
        } else if (operation.equals("/")) {
            answer = number1 / number2;
        } else if (operation.equals("*")) {
            answer = number1 * number2;
        }

        System.out.println("The calculation of " + number1 + " " + operation + " " + number2 + " = " + answer);

    }
}
