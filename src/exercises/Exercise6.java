package exercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter integer n: ");
        int n = scanner.nextInt();
        int count = 0;
        int d = 1;

        for(int i = 2; i <= n; i +=2){
            if (count == d){
                System.out.print(-i + " ");
                count = 0;
                d++;
            } else {
                System.out.print(i + " ");
                count++;
            }
        }
        scanner.close();
    }
}
