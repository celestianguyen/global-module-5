package exercises;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        /*
        Print Rectangle Shapes Using Asterisks (*)
        Problem
        Print the following asterisk (*) shapes. The length of the sides is not fixed and is entered by the user.
        Shape A
        * * * * * *
        *
        *
        *
        *
        * * * * * *

        Shape B
        * * * * * *
                  *
                  *
                  *
                  *
        * * * * * *

        Shape C
        *         *
        *         *
        *         *
        *         *
        *         *
        * * * * * *
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Please enter the number of columns: ");
        int col = scanner.nextInt();
        if (row < 0 || col < 0){
            System.out.println("Invalid input! You must enter a positive value.");
            return;
        }

        System.out.println("Shape A:");
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= col; j++){
                if(i == 1 || i == row || j == 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Shape B:");
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= col; j++){
                if(i == 1 || i == row || j == col){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Shape C:");
        for (int i = 1; i <= row; i++){
            for (int j = 1; j <= col; j++){
                if(j == 1 || i == row || j == col){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        scanner.close();
    }
}
