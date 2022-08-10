//Ques 4) Write two methods with the same name and same number of parameters of different type and call from main method.

package A13_MethodOverloading;

public class Ques04 {

    void method(String name) {
        System.out.println("Name: " + name);
    }

    void method(int age) {
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Ques04 obj = new Ques04();

        System.out.println("Calling Method 1");
        obj.method("Kritagya");

        System.out.println();

        System.out.println("Calling Method 2");
        obj.method(21);
    }
}
