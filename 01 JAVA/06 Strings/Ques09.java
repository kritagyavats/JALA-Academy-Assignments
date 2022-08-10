//Ques 9) Trimming strings with trim()

package A06_Strings;

public class Ques09 {
    public static void main(String[] args) {
        String str1 = " This is a string 1. ";
        String str2 = "This is a string 2. ";
        String str3 = " This is a string 3.";

        //trim() removes the space from beginning and ending of string
        System.out.println(str1.trim());            //Prints "This is a string 1."
        System.out.println(str2.trim());            //Prints "This is a string 2."
        System.out.println(str3.trim());            //Prints "This is a string 3."
    }
}
