//Ques 6) Matching a String Against a Regular Expression With matches()

package A06_Strings;

public class Ques06 {
    public static void main(String[] args) {
        String str = "String is a sequence of characters.";

        System.out.println(str.matches("(.*)sequence(.*)"));        //Prints 'true'
        System.out.println(str.matches("(.*)of c(.*)"));            //Prints 'true'
        System.out.println(str.matches("(.*)Stringis(.*)"));        //Prints 'false'
    }
}
