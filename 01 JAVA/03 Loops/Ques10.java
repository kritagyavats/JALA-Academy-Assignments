//Ques 10) Write a program to find the palindrome or not.

package A03_Loops;

import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        int num = scan.nextInt();

        int sum = 0;
        int temp = num;
        int rem;

        while (num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num/10;
        }

        if (temp == sum) {
            System.out.print("Palindrome");
        }
        else {
            System.out.print("Not Palindrome");
        }
    }
}
