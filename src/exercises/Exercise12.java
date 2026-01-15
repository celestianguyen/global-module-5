package exercises;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter integer n: ");
        int n = scanner.nextInt();
        int s = 0;
        int p = 1;
        int rem;
        while (n>0){
            for(int i = 1; i <= n; i++ ){
                rem = n % 10;
                s += rem;
                p *= rem;
                n = (n - rem) /10;
            }
            System.out.println("Sum =" + s);
            System.out.println("Product =" + p);
        }

    }
}
