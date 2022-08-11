package first_java_PROGRAMMES;
//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;

//    1. Input 2 numbers
//    2. know digits in intiger:
//        int length = 0;
//        long temp = 1;
//        while (temp <= number) {
//        length++;
//        temp *= 10;
//        }
//        return leangth;
//    3. calculate cube of each digit & add it to single variable (long).:
//        total = 0
//        n = number;
//        for (int i = 1; i < leangth; i ++):
//            digit = n % 10;
//            n = n / 10;
//            total = total + (digit * digit * digit);
//    4. Check if total = number.
//    5. Repeat same for number2.
//    6. Use if-else loop to provide output
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner inputArmstrong = new Scanner(System.in);
        long inputNumber1, inputNumber2;
        boolean numberArmstrong1, numberArmstrong2;

        System.out.print("Enter first number: ");
        inputNumber1 = inputArmstrong.nextLong();

        System.out.print("Enter second number: ");
        inputNumber2 = inputArmstrong.nextLong();

        int leangth = 0, digit;
        long temp = 1, total = 0;
        long n = inputNumber1;

        while (temp <= n) {
            leangth++;
            temp *= 10;
        }

        for (int i = 0; i < leangth; i ++) {
            digit = (int)(n % 10);
            n = n / 10;
            total = total + (digit * digit * digit);
        }

        if (total == inputNumber1) {
            numberArmstrong1 = true;
        } else {
            numberArmstrong1 = false;
        }

        leangth = 0;
        digit = 0;
        temp = 1;
        total = 0;
        n = inputNumber2;

        while (temp <= n) {
            leangth++;
            temp *= 10;
        }

        for (int i = 0; i < leangth; i ++) {
            digit = (int)(n % 10);
            n = n / 10;
            total = total + (digit * digit * digit);
            //System.out.println(total);
        }

        if (total == inputNumber2) {
            numberArmstrong2 = true;
        } else {
            numberArmstrong2 = false;
        }

        if (numberArmstrong1 == true){
            System.out.println("First number: " + inputNumber1 + " is Armstrong number.");
        }
        if (numberArmstrong2 == true) {
            System.out.println("Second number: " + inputNumber2 + " is Armstrong number.");
        }
        if ((numberArmstrong1 == false) && (numberArmstrong2 == false)) {
            System.out.println("None of the both numbers " + inputNumber1 + " and " + inputNumber2 + " aren't Armstrong numbers.");
        }
    }
}
