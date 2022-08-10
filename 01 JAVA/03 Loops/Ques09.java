//Ques 9) Write a program to find the prime or not.

package A03_Loops;

import java.util.Scanner;

public class Ques09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        int num = scan.nextInt();

        int flag = 0;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = 0;
                break;
            }
            else {
                flag = 1;
            }
        }
        if (flag == 1) {
            System.out.print("Prime");
        }
        else {
            System.out.print("Not Prime");
        }
    }
}
