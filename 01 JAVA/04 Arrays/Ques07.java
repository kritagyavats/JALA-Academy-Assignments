//Ques 7) Write a function to insert an element at a specific position in the array.

package A04_Arrays;

import java.util.Arrays;

public class Ques07 {
    static void insertElement (int[] arr, int num, int pos) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < pos-1) {
                newArr[i] = arr[i];
            }
            else if (i == pos-1) {
                newArr[i] = num;
            }
            else {
                newArr[i] = arr[i-1];
            }
        }
        System.out.println("Updated Array: " + Arrays.toString(newArr));
    }

    public static void main(String[] args) {
        int[] arr = {13, 6, 22, 29, 8, 3, 14, 26, 23, 21, 19, 27};
        int num = 15;
        int pos = 7;
        System.out.println("Original Array: " + Arrays.toString(arr));
        insertElement(arr, num, pos);
    }
}
