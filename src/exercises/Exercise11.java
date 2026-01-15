package exercises;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter n: ");
        int n = scanner.nextInt();

        if(n <= 0){
            System.out.println("n must be a positive integer!");
            return;
        }
        double sum = 0.0;
        long factorial = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*i -1; j++){
                factorial *=j;
            }
            sum += 1.0/factorial;
        }
        System.out.print("Sum = " + sum);

        scanner.close();

    }
}
