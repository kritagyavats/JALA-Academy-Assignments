//Ques 16) Write a function to get the difference of largest and smallest value.

package A04_Arrays;

public class Ques16 {
    static void difference(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            else if (arr[i] < min) {
                min = arr[i];
            }
        }
        int diff = max - min;
        System.out.println("Largest Value: " + max);
        System.out.println("Smallest Value: " + min);
        System.out.println("Difference Between Them: " + diff);
    }

    public static void main(String[] args) {
        int[] arr = {77, 84, 15, 42, 97, 62, 53, 69, 13, 47};
        difference(arr);
    }
}
