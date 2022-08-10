//Ques 1) Write a function to add integer values of an array.

package A04_Arrays;

public class Ques01 {
    static void addValue(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.print("Sum: " + sum);
    }

    public static void main(String[] args) {
        int[] arr = {29, 15, 23, 38, 19, 26, 11, 47, 75, 69, 52};
        addValue(arr);
    }
}
