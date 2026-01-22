package exercises;
import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        /*
        Find the Greatest Common Divisor (GCD) and Least Common Multiple (LCM) of Two Positive Integers
        Problem
        Enter two positive integers a and b.
        Then print the Greatest Common Divisor (GCD) and the Least Common Multiple (LCM) of these two numbers.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a: ");
        int a = scanner.nextInt();
        System.out.print("Please enter b: ");
        int b = scanner.nextInt();
        if (a < 0 || b < 0){
            System.out.println("Invalid input! please enter a positive integer!");
            return;
        }

        for (int i = Math.min(a,b); i >= 1; i--){
            if (a % i == 0 && b % i == 0){
                System.out.println("gcd = " + i);
                break;
            }
        }

        for (int j = Math.max(a,b); j <= a*b; j++){
            if (j % a == 0 && j % b == 0){
                System.out.println("lcm = " + j);
                break;
            }
        }
        scanner.close();
    }
}
