package exercises;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        /*
        Convert a Positive Integer to Binary
        Problem
        Write a program that takes a positive integer n as input and converts it to binary.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a positive integer n: ");
        int n = scanner.nextInt();
        if (n < 0){
            System.out.println("Invalid input!");
            return;
        }
        String binary = "";

        while (n > 0) {
            int remainder = n % 2;
            binary = remainder + binary;
            n = n / 2;
        }

        System.out.println("Binary representation: " + binary);
        scanner.close();
    }
}
