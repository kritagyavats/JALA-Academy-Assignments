//Ques 19) Write a function to find the missing number of sorted array of 1 to 100.

package A04_Arrays;

import java.util.Arrays;

public class Ques19 {
    static void missing(int[] arr) {
        Arrays.sort(arr);
        int i = 0;
        System.out.print("Missing Numbers: ");
        for (int k = 1; k <= 100; k++) {
            if (i < arr.length && k == arr[i]) {
                i++;
            }
            else {
                System.out.print(k + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,12,14,16,18,20,21,23,25,27,29,32,34,36,38,40,41,43,45,47,49,52,54,56,58,60,61,63,65,67,69,72,74,76,78,80,81,83,85,87,89,92,94,96,98,100};
        missing(arr);
    }
}
