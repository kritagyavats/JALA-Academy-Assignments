//Ques 15) Write a method to find number of even number and odd numbers in an array.

package A04_Arrays;

import java.util.Arrays;

public class Ques15 {
    static void odd(int[] arr) {
        int count1 = 0;
        System.out.print("Odd Elements: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
                count1++;
            }
        }
        System.out.println();
        System.out.println("Total Number Of Odd Elements: " + count1);
    }

    static void even(int[] arr) {
        int count2 = 0;
        System.out.print("Even Elements: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                count2++;
            }
        }
        System.out.println();
        System.out.println("Total Number Of Even Elements: " + count2);
    }

    public static void main(String[] args) {
        int[] arr = {11, 12, 22, 24, 33, 36, 44, 48, 55, 60, 66, 72, 77, 84, 88, 96, 99};
        System.out.println("Original Array: " + Arrays.toString(arr));
        odd(arr);
        even(arr);
    }
}
