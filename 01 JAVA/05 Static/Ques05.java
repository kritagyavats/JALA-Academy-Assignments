//Ques 5) Call static methods in instance methods.

package A05_Static;

public class Ques05 {

    static void statMethod() {
        System.out.println("Calling Static Method in Instance Method");
    }

    void instMethod() {
        statMethod();
    }

    public static void main(String[] args) {
        Ques05 obj = new Ques05();
        obj.instMethod();
    }
}
