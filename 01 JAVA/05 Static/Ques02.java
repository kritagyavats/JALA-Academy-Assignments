//Ques 2) Print instance variables in static methods.

package A05_Static;

public class Ques02 {

    int instVar = 39;

    static void statMethod() {
        Ques02 obj = new Ques02();
        System.out.println("Instance Variable: " + obj.instVar);
    }

    public static void main(String[] args) {
        statMethod();
    }
}
