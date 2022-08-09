package first_java_PROGRAMMES;

import java.util.Scanner;

// Problem : Write a program to print whether a number is even or odd, also take input from the user.
//  1. Get input from user
//  2. Check if number is 0:
//      output: "even number"
//      exit
//  3. if (( number % 2) == 0):
//      output: "even number"
//     else:
//       output: "odd number"
//  4. End the program

// Get input

public class EvenOdd {
    public static void main(String[] args) {

        Scanner inputNumberScanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int numberRecieved = inputNumberScanner.nextInt();

//        check even or odd
        if ((numberRecieved == 0) || ( (numberRecieved % 2) == 0)){
            System.out.println("Number " + numberRecieved + " is even.");
        }
        else {
            System.out.println("Number " + numberRecieved + " is odd.");
        }
    }
}
