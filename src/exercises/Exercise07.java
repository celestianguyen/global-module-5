package exercises;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        /*
        Print the Fibonacci Sequence Up to n
        Problem
        Print the Fibonacci sequence: 1, 2, 3, 5, 8, 13, … n. where n is a number entered from the keyboard (*).
        The Fibonacci sequence is a series of numbers that starts with 0 and 1. Each next number is the sum of the two numbers before it.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter n: ");
        int n = scanner.nextInt();
        if (n < 0){
            System.out.println("Invalid input!");
            scanner.close();
            return;
        }

        int a = 0;
        int b = 1;
        int res;

        for (int i = 1; i <= n; ){
            System.out.print(i + " ");
            res = a + b;
            a = b;
            b = res;
            i = a + b;
        }
        scanner.close();
    }
}
