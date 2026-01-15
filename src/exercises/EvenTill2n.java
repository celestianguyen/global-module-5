package exercises;

import java.util.Scanner;

public class EvenTill2n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter integer n: ");
        int n = scanner.nextInt();

        for (int i = 2; i <= 2*n;i +=2){
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
