//Ques 4) Extract a string using substring.

package A06_Strings;

public class Ques04 {
    public static void main(String[] args) {
        String str = "Java program for strings";

        String substr = str.substring(5, 19);      //Prints substring of string str from index 5 to 18

        System.out.println(substr);
    }
}
