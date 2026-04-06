package exercises;

import java.util.Scanner;

public class Exercise24 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product price (VND): ");
        int price = scanner.nextInt();

        System.out.print("Enter amount paid (VND): ");
        int paid = scanner.nextInt();

        if (paid < price) {
            System.out.println("Not enough money paid.");
            scanner.close();
            return;
        }

        int change = paid - price;
        System.out.println("Change to return: " + change + " VND");

        int[] denominations = {
                500000, 200000, 100000, 50000,
                20000, 10000, 5000, 2000, 1000
        };

        for (int i = 0; i < denominations.length; i++) {
            int note = denominations[i];

            if (change >= note) {
                int count = change / note;
                System.out.println(note + " VND: " + count + " notes");
                change %= note;
            }
        }

        scanner.close();
    }
}