package exercises;


import java.util.Scanner;

/*
Calculate the Sum S = 1 + 1/2 + 1/3 + … + 1/n
Problem
Write a program to calculate the sum: S = 1 + 1/2 + 1/3 + … + 1/n
The value n is entered from the keyboard.
 */
public class Exercise10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. n must be positive.");
            scanner.close();
            return;
        }

        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;  // 1.0 (not 1)
        }

        System.out.printf("Sum S = %.5f%n", sum);

        scanner.close();
    }
}
