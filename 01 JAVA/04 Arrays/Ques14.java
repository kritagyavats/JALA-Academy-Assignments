//Ques 14) Write a method to find the second-largest number in an array.

package A04_Arrays;

public class Ques14 {
    static void secondLargest(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Second Largest Element: " + arr[arr.length - 2]);
    }

    public static void main(String[] args) {
        int[] arr = {17, 23, 29, 35, 41, 23, 41, 37, 47, 45, 25};
        secondLargest(arr);
    }
}
