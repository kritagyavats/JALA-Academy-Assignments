//Ques 3) Program to equal operator and not equal operators

package A02_Operators;

import java.util.Scanner;

public class Ques03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = scan.nextInt();

        if (num1 == num2) {
            System.out.print("Both the numbers are equal.");
        }
        else if (num1 != num2) {
            System.out.print("Both the numbers are not equal.");
        }
    }
}
