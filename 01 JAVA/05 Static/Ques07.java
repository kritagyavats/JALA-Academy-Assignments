//Ques 7) Call static methods and instance methods in main method.

package A05_Static;

public class Ques07 {

    static void statMethod1() {
        System.out.println("Calling Static Method in Main Method");
    }

    static void statMethod2() {
        System.out.println("Calling Static Method in Main Method");
    }

    void instMethod1() {
        System.out.println("Calling Instance Method in Main Method");
    }

    void instMethod2() {
        System.out.println("Calling Instance Method in Main Method");
    }

    public static void main(String[] args) {
        statMethod1();
        statMethod2();

        Ques07 obj = new Ques07();
        obj.instMethod1();
        obj.instMethod2();
    }
}
