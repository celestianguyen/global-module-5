package exercises;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        /*
        Calculate the Sum of Factorials of Three Positive Integers
        Problem
        Write a program to calculate: S = a! + b! + c! where a, b, and c are three positive integers entered from the keyboard.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter positive integer a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter positive integer b: ");
        int b = scanner.nextInt();
        System.out.print("Please enter positive integer c: ");
        int c = scanner.nextInt();
        if (a < 0 || b < 0 || c < 0){
            System.out.println("Invalid input!");
            scanner.close();
            return;
        }

        long sum = factorial(a) + factorial(b) + factorial(c);

        System.out.println("S = " + a + "! + " + b + "! + " + c + "! = " + sum);

        scanner.close();
    }
    private static long factorial(int n) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
