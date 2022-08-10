//Ques 8) Write a function to find the minimum and maximum value of an array.

package A04_Arrays;

import java.util.Arrays;

public class Ques08 {
    static void minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Value: " + min);
    }

    static void maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum Value: " + max);
    }

    public static void main(String[] args) {
        int[] arr = {63, 29, 14, 28, 56, 42, 65, 91, 78, 52, 39, 81};
        System.out.println("Array: " + Arrays.toString(arr));
        minValue(arr);
        maxValue(arr);
    }
}
