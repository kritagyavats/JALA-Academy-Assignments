//Ques 17) Write a method to verify if the array contains two specified elements(12,23).

package A04_Arrays;

import java.util.Scanner;

public class Ques17 {
    static void contains(int[] arr, int num1, int num2) {
        boolean check1 = false;
        boolean check2 = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num1) {
                check1 = true;
            }
            if (arr[i] == num2) {
                check2 = true;
            }
        }
        if (check1 == true) {
            System.out.println(num1 + " present in array.");
        }
        else {
            System.out.println(num1 + " not present in array!");
        }

        if (check2 == true) {
            System.out.println(num2 + " present in array.");
        }
        else {
            System.out.println(num2 + " not present in array!");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {11, 29, 13, 27, 15, 25, 17, 23, 19, 21, 20};
        System.out.print("Enter First Number To Search: ");
        int num1 = scan.nextInt();
        System.out.print("Enter Second Number To Search: ");
        int num2 = scan.nextInt();

        contains(arr, num1, num2);
    }
}
