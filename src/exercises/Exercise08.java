package exercises;

import java.util.Scanner;

/*
Print the Sequence 1, 3, 7, 15, 31, … n
Problem
Print the number sequence: 1, 3, 7, 15, 31, … n. where n is a number entered from the keyboard.

--
0x2 + 1 = 1
1x2 + 1 = 3
3x2 + 1 = 7


 */
public class Exercise08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Please enter n: ");
            n = scanner.nextInt();
        } while (n < 0);
        int res = 0;

        while (true){
            res = 2 * res + 1;
            if (res > n){
                break;
            }
            System.out.print(res + " ");
        }
    }
}
