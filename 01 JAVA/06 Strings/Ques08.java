//Ques 8) equalsIgnoreCase(), startsWith(), endsWith() and compareTo().

package A06_Strings;

public class Ques08 {
    public static void main(String[] args) {
        String str1 = "String Comparison For Equality";
        String str2 = "string comparison for equality";
        String str3 = "String Comparison For Equality";
        String str4 = "String Comparison";

        //equalsIgnoreCase() ignores case of string
        System.out.println(str1.equalsIgnoreCase(str2));        //Prints 'true'
        System.out.println(str1.equalsIgnoreCase(str3));        //Prints 'true'
        System.out.println(str1.equalsIgnoreCase(str4));        //Prints 'false'

        //startsWith() checks the beginning of string
        System.out.println(str1.startsWith("Str"));             //Prints 'true'
        System.out.println(str1.startsWith("Stir"));            //Prints 'false'

        //endsWith() checks the ending of string
        System.out.println(str1.endsWith("ity"));               //Prints 'true'
        System.out.println(str1.endsWith("ilty"));              //Prints 'false'

        //compareTo() checks the equality of string and returns 0 if equal
        System.out.println(str1.compareTo(str2));               //return negative value
        System.out.println(str1.compareTo(str3));               //return 0
        System.out.println(str1.compareTo(str4));               //return positive value
    }
}
