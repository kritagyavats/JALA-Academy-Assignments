//Ques 5) Write a function to remove a specific element from an array.

package A04_Arrays;

import java.util.Arrays;

public class Ques05 {
    static int[] removeElement(int[] arr, int remove) {
        //Creating second array, which copies elements from first array except the search value
        int[] arrUpdated = new int[arr.length - 1];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == remove) {
                continue;
            }
            arrUpdated[j++] = arr[i];
        }
        return arrUpdated;
    }

    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        int remove = 55;
        arr = removeElement(arr, remove);
        System.out.print("Updated Array After Deletion: " + Arrays.toString(arr));
    }
}
