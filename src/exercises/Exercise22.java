package exercises;

public class Exercise22 {
    public static void main(String[] args) {
        /*
        Find Numbers That Satisfy a Given Condition
        Problem
        Find and print all integers in the range from 10 to 99 such that the product of its two digits is equal to twice the sum of its two digits. Example: 44
         */

        for(int i = 10; i <= 99;i++){
            int secondDigit = i % 10;

            int firstDigit = i/10;
            if ((firstDigit*secondDigit == 2*(firstDigit+secondDigit))){
                System.out.println(i);
            }
        }
    }
}
