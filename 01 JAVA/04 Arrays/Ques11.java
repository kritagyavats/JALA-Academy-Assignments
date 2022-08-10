//Ques 11) Write a program to find the common values between two arrays.

package A04_Arrays;

public class Ques11 {
    static void commonValue(int[] arr1, int[] arr2) {
        System.out.println("Common Values");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] arr2 = {15, 30, 45, 60, 75, 90, 105, 120};
        commonValue(arr1, arr2);
    }
}
