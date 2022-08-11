package first_java_PROGRAMMES;

//To find out whether the given String is Palindrome or not

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        String stringToCheck = "", reverseString = "";

        System.out.print("Enter a string to check: ");
        stringToCheck = inputString.nextLine();

        for (int i = stringToCheck.length() - 1; i >= 0; i--){
            reverseString = reverseString + stringToCheck.charAt(i);
        }

        if (stringToCheck.equals(reverseString)){
            System.out.println("Given String \"" + stringToCheck + "\" is Palindrome string (" + reverseString + ").");
        } else {
            System.out.println("Given String \"" + stringToCheck + "\" is NOT Palindrome string (" + reverseString + ").");
        }
    }
}
