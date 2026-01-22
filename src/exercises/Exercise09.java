package exercises;

import java.util.Scanner;

/*
Print the Sequence 1, -3, 7, -15, 31, … n
Problem
Print the number sequence: 1, -3, 7, -15, 31, … where n is a number entered from the keyboard.
 */
public class Exercise09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int res = 0;

        do {
            System.out.print("Please enter n: ");
            n = scanner.nextInt();
        } while (n < 0);

        while(true){
            res = 2 * res + 1;
            if (res > n){
                break;
            }
            if (res % 3 == 0){
                System.out.print(-res + " ");
            } else {
                System.out.print(res + " ");
            }
        }
        scanner.close();
    }
}
