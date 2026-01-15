package exercises;

import java.util.Scanner;

public class PrintAsteriskRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter rows: ");
        int r = scanner.nextInt();
        System.out.print("Please enter columns: ");
        int c = scanner.nextInt();

        if (r < 2 || c < 2){
            System.out.println("Invalid! Sides cannot be a negative number.");
            return;
        }

        for(int i = 1; i <= r; i++){
            for(int j = 1; i <=c; j++){
                if (i ==1 || i == r || j == 1 || j == c){
                    System.out.print("* ");
                } else {
                    System.out.println(" ");
                }

            }
        }

        scanner.close();
    }
}
