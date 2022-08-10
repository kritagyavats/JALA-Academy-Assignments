/*Ques 1)
a) A, B and C are classes
b) A is a super class. B is a subclass of A. C is a subclass of B.
c) Create three methods in each class, 2 methods are specific to each class and third method (override method) should be in all three Classes A, B and C
d) Create a class with main method. Create an object for each class A, B and C in main method and call every method of each class using its own object/instance.
e) Call an overridden method with super class reference to B and C class’s objects
f) Runtime Polymorphism with Data Members/Instance variables, Repeat the above process only for data members
*/

package A07_Inheritance;

// Creating three classes A, B, C
// A is a super class
class A {
    int num = 30;

    void A1() {                                 //Creating method 1
        System.out.println("Method 1 of class A");
    }

    void A2() {                                 //Creating method 2
        System.out.println("Method 2 of class A");
    }

    void overriddenMethod() {                   //Creating method 3 (Overridden Method)
        System.out.println("Override Method of class A");
    }

}

// B is a subclass of A
class B extends A {
    int num = 40;

    void B1() {                                 //Creating method 1
        System.out.println("Method 1 of class B");
    }

    void B2() {                                 //Creating method 2
        System.out.println("Method 2 of class B");
    }

    @Override
    void overriddenMethod() {                   //Creating method 3 (Overridden Method)
        System.out.println("Override Method of class B");
    }
}

// C is a subclass of B
class C extends B {
    int num = 50;

    void C1() {                                 //Creating Method 1
        System.out.println("Method 1 of class C");
    }

    void C2() {                                 //Crating Method 2
        System.out.println("Method 2 of class C");
    }

    @Override
    void overriddenMethod() {                   //Creating method 3 (Overridden Method)
        System.out.println("Override Method of class C");
    }
}

public class Ques01 {
    public static void main(String[] args) {

        //Calling methods of class A
        A obj1 = new A();
        obj1.A1();
        obj1.A2();
        obj1.overriddenMethod();
        System.out.println();

        //Calling methods of class B
        B obj2 = new B();
        obj2.B1();
        obj2.B2();
        obj2.overriddenMethod();
        System.out.println();

        //Calling methods of class C
        C obj3 = new C();
        obj3.C1();
        obj3.C2();
        obj3.overriddenMethod();
        System.out.println();

        //Calling overridden method with superclass reference
        A ovr;
        //class B
        ovr = new B();
        ovr.overriddenMethod();
        //class C
        ovr = new C();
        ovr.overriddenMethod();
        System.out.println();

        //Runtime polymorphism with data members
        A run;
        run = new A();
        System.out.println(run.num);
        run = new B();
        System.out.println(run.num);
        run = new C();
        System.out.println(run.num);
    }
}
