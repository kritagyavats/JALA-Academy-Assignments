//Ques 11) Splitting strings with split()

package A06_Strings;

public class Ques11 {
    public static void main(String[] args) {
        String str = "Code To Split String";

        String[] spl = str.split(" ");

        for (String i : spl) {
            System.out.println(i);
        }
    }
}
