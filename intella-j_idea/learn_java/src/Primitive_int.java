import java.util.Scanner;

public class Primitive_int {
    public static void main(String[] args) {
        // create input object
        Scanner input = new Scanner(System.in);
        // Get roll no input
        System.out.print("Enter Your Roll No: ");
        int rollno = input.nextInt();
        // Print rollno
        System.out.println("Your Roll No is :" + rollno);

        System.out.println("\nEnter current World population: ");
        long population = input.nextLong();
        System.out.println("Current population of world is :" + population);
    }
}
