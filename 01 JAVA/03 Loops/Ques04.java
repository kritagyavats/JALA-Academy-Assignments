//Ques 4) Write a program to print the odd and even numbers.

package A03_Loops;

import java.util.Scanner;

public class Ques04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Range");

        System.out.print("Enter Start Value: ");
        int num1 = scan.nextInt();

        System.out.print("Enter End Value: ");
        int num2 = scan.nextInt();

        System.out.print("Odd Numbers: ");
        for (int i = num1; i<=num2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.print("Even Numbers: ");
        for (int i = num1; i<=num2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
