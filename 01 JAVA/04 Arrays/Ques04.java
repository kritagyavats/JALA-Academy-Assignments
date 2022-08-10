//Ques 4) Write a function to test if array contains a specific value.

package A04_Arrays;

public class Ques04 {
    static boolean checkElement(int[] arr, int check) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == check) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {17, 34, 51, 68, 85, 102, 119, 136, 153, 170};
        int check1 = 102;
        boolean contains = checkElement(arr, check1);
        if (contains) {
            System.out.print(check1 + " Present In Array");
        }
        else {
            System.out.print(check1 + " Not Present In Array");
        }
        System.out.println();

        int check2 = 69;
        boolean contains2 = checkElement(arr, check2);
        if (contains2) {
            System.out.print(check2 + " Present In Array");
        }
        else {
            System.out.print(check2 + " Not Present In Array");
        }
    }
}
