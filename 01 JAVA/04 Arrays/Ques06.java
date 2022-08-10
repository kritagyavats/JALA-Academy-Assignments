//Ques 6) Write a function to copy an array to another array.

package A04_Arrays;

import java.util.Arrays;

public class Ques06 {
    static void copyArray(int[] arr) {
        int[] copied = new int[arr.length];
        for (int i = 0; i <arr.length; i++) {
            copied[i] = arr[i];
        }
        System.out.print("Copied Array: " + Arrays.toString(copied));
    }

    public static void main(String[] args) {
        int[] arr = {9, 18, 27, 36, 45, 54, 63, 72, 81, 90};
        System.out.println("Original Array: " + Arrays.toString(arr));
        copyArray(arr);
    }
}
