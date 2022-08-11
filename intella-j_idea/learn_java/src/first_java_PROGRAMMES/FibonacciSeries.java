package first_java_PROGRAMMES;

//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner inputFibonacciRange = new Scanner(System.in);
        long fibonacciRange, currentFibbonacciNumber, previousFibonacciNumber = 1, nFibonacciNumber = 0;

        System.out.print("Enter the highest number, required in Fibonacci Series: ");
        fibonacciRange = inputFibonacciRange.nextLong();

        if (fibonacciRange == 0) {
            System.out.println(nFibonacciNumber);
        } else if (fibonacciRange == 1) {
            System.out.print(nFibonacciNumber + "\n" + previousFibonacciNumber);
        } else {
            System.out.println(nFibonacciNumber + "\n" + previousFibonacciNumber);
            currentFibbonacciNumber = previousFibonacciNumber;

            while (currentFibbonacciNumber <= fibonacciRange) {
                currentFibbonacciNumber = previousFibonacciNumber + nFibonacciNumber;
                System.out.println(currentFibbonacciNumber);

                nFibonacciNumber = previousFibonacciNumber;
                previousFibonacciNumber = currentFibbonacciNumber;
            }
        }
    }
}
