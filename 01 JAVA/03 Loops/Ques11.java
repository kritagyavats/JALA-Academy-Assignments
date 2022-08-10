//Ques 11) Program to check whether a number is even or odd using switch

package A03_Loops;

import java.util.Scanner;

public class Ques11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        int num = scan.nextInt();

        switch (num % 2) {
            case 0:
                System.out.print("Even Number");
                break;

            case 1:
                System.out.print("Odd Number");
                break;
        }
    }
}
