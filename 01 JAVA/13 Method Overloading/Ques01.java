//Ques 1) Write two methods with the same name but different number of parameters of same type and call the methods from main method

package A13_MethodOverloading;

public class Ques01 {

    void method(String firstName) {
        System.out.println("First Name: " + firstName);
    }

    void method(String firstName, String lastName) {
        System.out.println("Full Name: " + firstName + " " + lastName);
    }

    public static void main(String[] args) {
        Ques01 obj = new Ques01();

        System.out.println("Calling Method 1");
        obj.method("Kritagya");

        System.out.println();

        System.out.println("Calling Method 2");
        obj.method("Kritagya", "Vats");
    }
}
