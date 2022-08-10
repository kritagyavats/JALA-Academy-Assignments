//Ques 4) Write a program to find the two numbers equal or not

package A02_Operators;

import java.util.Scanner;

public class Ques04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = scan.nextInt();

        if (num1 == num2) {
            System.out.print("Two numbers are equal.");
        }
        else if (num1 != num2) {
            System.out.print("Two numbers are not equal.");

        }
    }
}
