package first_java_PROGRAMMES;

// problem : Take name as input and print a greeting message for that particular name.
// 1. input: name
// 2. output: "Hello " + name

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {

        // Fetching name input
        Scanner nameInput = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String userName = nameInput.next();

        // print output
        System.out.println("Hello " + userName + "! Hope you are Doing Great!");


    }
}
