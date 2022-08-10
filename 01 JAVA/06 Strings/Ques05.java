//Ques 5) Searching in strings using indexOf().

package A06_Strings;

public class Ques05 {
    public static void main(String[] args) {
        String str = "Finding index of string";

        int num1 = str.indexOf('x');        //Finds the index of 'x'
        int num2 = str.indexOf('i', 7);     //Finds the index of first 'i' starting from index 7

        System.out.println("Index: " + num1);
        System.out.println("Index: " + num2);
    }
}
