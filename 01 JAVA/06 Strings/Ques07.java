//Ques 7) Comparing strings using the methods equals().

package A06_Strings;

public class Ques07 {
    public static void main(String[] args) {
        String str1 = "String comparison for equality";
        String str2 = "String comparison for equality";
        String str3 = "String comparison";

        //equals() checks whether the two strings are equal or not
        System.out.println(str1.equals(str2));          //Prints 'true'
        System.out.println(str1.equals(str3));          //Prints 'false'
    }
}
