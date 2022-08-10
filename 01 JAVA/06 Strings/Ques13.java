//Ques 13) Converting integer objects to Strings

package A06_Strings;

public class Ques13 {
    public static void main(String[] args) {
        int num1 = 98312;
        int num2 = 58807;

        //Integer.toString() converts Integer type to String type.
        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);

        System.out.print("Integer to String: " + str1 + str2);
    }
}
