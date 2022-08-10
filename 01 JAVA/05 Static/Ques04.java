//Ques 4) Call instance methods in static methods.

package A05_Static;

public class Ques04 {

    void instMethod() {
        System.out.println("Calling Instance Method in Static Method");
    }

    static void statMethod() {
        Ques04 obj = new Ques04();
        obj.instMethod();
    }

    public static void main(String[] args) {
        statMethod();
    }
}
