package exercises;

import java.util.Scanner;

public class PrintOddNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter integer n: ");
        int n = scanner.nextInt();

        for (int i = 0; i <= (n - 1)/2; i++){
            System.out.print(2*i + 1 + " ");
        }
        scanner.close();
    }
}
