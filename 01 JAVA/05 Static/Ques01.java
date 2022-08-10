//Ques 1) Write a class with 2 static variables, 2 instance variables, 2 static methods, 2 instance methods and a main method.

package A05_Static;

public class Ques01 {

    //Two static variables
    static int statVar1 = 45;       //Static variable 1
    static char statVar2 = '@';     //Static variable 2

    //Two instance variables
    int instVar1 = 36;              //Instance variable 1
    char instVar2 = '&';            //Instance variable 2

    //Two static methods
    static void statMethod1() {     //Static method 1
        System.out.println("Static Variable 1: " + statVar1);
    }

    static void statMethod2() {     //Static method 2
        System.out.println("Static Variable 2: " + statVar2);
    }

    //Two instance methods
    void instMethod1() {            //Instance method 1
        System.out.println("Instance Variable 1: " + instVar1);
    }

    void instMethod2() {            //Instance method 2
        System.out.println("Instance Variable 2: " + instVar2);
    }

    //main method
    public static void main(String[] args) {

        statMethod1();
        statMethod2();

        Ques01 obj = new Ques01();
        obj.instMethod1();
        obj.instMethod2();

        System.out.println("Main Method");
    }
}
