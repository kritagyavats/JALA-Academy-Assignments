//Ques 8) Write a program to find Armstrong number or not.

package A03_Loops;

import java.util.Scanner;

public class Ques08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Any Number: ");
        int num = scan.nextInt();

        int temp = num;
        int count = 0;
        int digit;
        int sum = 0;

        //While Loop to count number of digits
        while (temp>0) {
            count = count + 1;
            temp = temp/10;
        }

        temp = num;

        while (temp>0) {
            digit = temp % 10;
            int pro = 1;
            for (int i = 1; i <= count; i++) {
                pro = pro * digit;
            }
            sum = sum + pro;
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.print("Armstrong Number");
        }
        else {
            System.out.print("Not Armstrong");
        }
    }
}
