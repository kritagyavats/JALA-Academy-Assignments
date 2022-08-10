//Ques 3) Write a program to find the index of an array element.

package A04_Arrays;

public class Ques03 {
    static void findIndex(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==  search) {
                System.out.print(search + " Found At Index: " + i);
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {14, 28, 56, 42, 65, 91, 78, 52, 39, 81};
        int search1 = 39;
        findIndex(arr, search1);
        System.out.println();
        int search2 = 42;
        findIndex(arr, search2);
    }
}
