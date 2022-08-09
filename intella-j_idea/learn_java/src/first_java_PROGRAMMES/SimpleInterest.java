package first_java_PROGRAMMES;

// Problem : Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
// 1. input: P, T, R
// 2. SI = P * T * (R / 100)
// 3. output: SI

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
//    Take input user
        Scanner inputLiteral = new Scanner(System.in);
        double principal_amout, rateOfInterest, simpleInterest;
        int timeDuration;

//        Principal amount
        System.out.print("Enter the Principal Amount : ");
        principal_amout = inputLiteral.nextDouble();
//        Rate of Interest
        System.out.print("Enter the Rate of Interest : ");
        rateOfInterest = inputLiteral.nextDouble() ;
//        Time period
        System.out.print("Enter the Time Period (in years) : ");
        timeDuration = inputLiteral.nextInt();

//        Calculate Simple interest
        simpleInterest = principal_amout * timeDuration * (rateOfInterest / 100);

//        Output rate of Interest
        System.out.println("Your Simple Interest is : " + simpleInterest + " per year");
    }
}
