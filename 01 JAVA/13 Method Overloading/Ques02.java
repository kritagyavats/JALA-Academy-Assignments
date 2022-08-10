//Ques 2) Write two methods with the same name but different number of parameters of different data type and call the methods from main method.

package A13_MethodOverloading;

public class Ques02 {

    void method(String name) {
        System.out.println("Name: " + name);

    }

    void method(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Ques02 obj = new Ques02();

        System.out.println("Calling Method 1");
        obj.method("Kritagya");

        System.out.println();

        System.out.println("Calling Method 2");
        obj.method("Kritagya", 21);
    }
}
