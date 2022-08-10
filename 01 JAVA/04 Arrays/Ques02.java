//Ques 2) Write a function to calculate the average value of an array of integers.

package A04_Arrays;

public class Ques02 {
    static void averageValue(int[] arr) {
        int sum = 0;
        int length = arr.length;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        int avg = sum/length;
        System.out.print("Average: " + avg);
    }

    public static void main(String[] args) {
        int[] arr = {36, 48, 72, 12, 84, 96, 24, 60};
        averageValue(arr);
    }
}
