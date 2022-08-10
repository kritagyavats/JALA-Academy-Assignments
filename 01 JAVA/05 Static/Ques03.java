//Ques 3) Print static variables in instance methods.

package A05_Static;

public class Ques03 {

    static int statVar = 89;

    void instMethod() {
        System.out.print("Static Variables: " + statVar);
    }

    public static void main(String[] args) {
        Ques03 obj = new Ques03();
        obj.instMethod();
    }
}
