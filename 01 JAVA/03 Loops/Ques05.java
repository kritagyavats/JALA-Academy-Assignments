//Ques 5) Write a program to print largest number among three numbers.

package A03_Loops;

import java.util.Scanner;

public class Ques05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input First Number: ");
        int num1 = scan.nextInt();

        System.out.print("Input Second Number: ");
        int num2 = scan.nextInt();

        System.out.print("Input Third Number: ");
        int num3 = scan.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.print("Largest: "+ num1);
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.print("Largest: "+ num2);
        }
        else {
            System.out.print("Largest Number: "+ num3);
        }
    }
}
