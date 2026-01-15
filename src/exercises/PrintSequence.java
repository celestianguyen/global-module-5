package exercises;

import java.util.Scanner;

public class PrintSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter integer n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }

        scanner.close();

    }
}
