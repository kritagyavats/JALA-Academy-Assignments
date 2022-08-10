//Ques 9) Write a function to reverse an array of integer values.

package A04_Arrays;

import java.util.Arrays;

public class Ques09 {
    static void reverse(int[] arr) {
        int[] revArray = new int[arr.length];
        int j = arr.length;
        for (int i = 0; i < arr.length; i++) {
            revArray[j - 1] = arr[i];
            j--;
        }
        System.out.println("Reversed Array: " + Arrays.toString(revArray));
    }

    public static void main(String[] args) {
        int[] arr = {23, 42, 16, 39, 67, 55, 29, 10, 91, 74};
        System.out.println("Original Array: " + Arrays.toString(arr));
        reverse(arr);
    }
}
