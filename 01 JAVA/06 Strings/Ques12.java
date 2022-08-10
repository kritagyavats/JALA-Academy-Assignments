//Ques 12) Converting Numbers to Strings with valueOf()

package A06_Strings;

public class Ques12 {
    public static void main(String[] args) {
        int num1 = 39;
        int num2 = 29;
        int num3 = 49;

        //valueOf() converts different types of values into string.
        String numToStr1 = String.valueOf(num1);
        String numToStr2 = String.valueOf(num2);
        String numToStr3 = String.valueOf(num3);

        System.out.println("Converted String: " + numToStr1 + numToStr2 + numToStr3);
    }
}
