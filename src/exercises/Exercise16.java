package exercises;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        /*
        Print Triangle Shapes Using Asterisks (*)
        Problem
        Print the following triangle shapes using asterisks (*). The side length of the triangle is not fixed and is entered by the user.
        Shape A
        *
        **
        ***
        ****
        *****

        Shape B
        *****
        ****
        ***
        **
        *

        Shape C
            *
           **
          ***
         ****
        *****

        Shape D
        *****
         ****
          ***
           **
            *

        Shape E
        *****
        *  *
        * *
        **
        *

        Shape F
           *
          ***
         *****
        *******

        Shape G
        *******
         *****
          ***
           *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter side length n: ");
        int n = scanner.nextInt();


        if (n < 0){
            System.out.println("Invalid input! You must enter a positive number.");
            return;
        }

        System.out.println("Shape A: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Shape B: ");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Shape C: ");
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Shape D: ");
        for (int i = 1; i <= n; i++){
            for (int j = 1; j < i; j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= n - i + 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        Shape E
        *****
        *  *
        * *
        **
        *
         */
        System.out.println();
        System.out.println("Shape E: ");
        for(int i = 1; i <= n; i ++){
            for (int j = 1; j <= (n - i + 1); j++){
                if (i == 1 || j == 1){
                    System.out.print("*");
                } else if (j == (n - i + 1)){
                    System.out.println("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        /*
        Shape F
           *
          ***
         *****
        *******
        i = 1: 3 " " 1*
        i = 2: 2 " " 3*
        i = 3: 1 " " 5*
        i = 4: 0 " " 7*

        The number of * characters in each row is (2 × row − 1).
         */
        System.out.println();
        System.out.println("Shape F: ");
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        Shape G
        *******
         *****
          ***
           *
         */
        System.out.println();
        System.out.println("Shape G: ");
        for(int i = n; i >= 1; i --){
            for (int j = 1; j <= (n - i); j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2*i -1; k++){
                System.out.print("*");
            }

            System.out.println();
        }




        scanner.close();
    }

}
