public class Ques12 {
    static int removeDuplicate(int[] arr, int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        //In order to remove duplicate values, we first need to sort the array.
        Arrays.sort(arr);

        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n-1; i++) {
            if (arr[i] != arr[i+1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];

        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int[] arr = {17, 23, 29, 35, 41, 23, 41, 37, 47, 45, 25};
        int len = arr.length;
        len = removeDuplicate(arr, len);

        System.out.print("Updated Array: ");
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
