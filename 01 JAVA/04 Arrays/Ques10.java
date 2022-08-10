//Ques 10) Write a function to find the duplicate values of an array.

package A04_Arrays;

public class Ques10 {
    static void duplicate(int[] arr) {
        System.out.println("Duplicate Values");
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {17, 23, 29, 35, 41, 23, 41, 37, 47, 45, 25};
        duplicate(arr);
    }
}
