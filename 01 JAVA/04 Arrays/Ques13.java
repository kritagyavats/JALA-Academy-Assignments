//Ques 13) Write a method to find the second-largest number in an array.

package A04_Arrays;

public class Ques13 {
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
        int[] arr = {10, 45, 78, 51, 65, 43, 89, 94, 36, 22};
        secondLargest(arr);
    }
}
