//Ques 10) Replacing characters in strings with replace()

package A06_Strings;

public class Ques10 {
    public static void main(String[] args) {
        String str = "string";

        System.out.println(str.replace('t', 'p'));          //replace t with p from string and prints "spring"
        System.out.println(str.replace("tr", "op"));        //replace tr with op from string and prints "soping"
    }
}
