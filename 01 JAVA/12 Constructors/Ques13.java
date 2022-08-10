/*Ques 3)
a) Apply private, public, protected and default access modifiers to the constructor.
b) Write constructors with return type int and String.
c) Try to call the constructor multiple times with the same object.
*/

package A12_Constructors;

public class Ques03 {
    String name;
    int age;
    int rollNumber;
    String course;

    //Default constructor.
    Ques03() {
        this("Kritagya");
    }

    //Public constructor.
    public Ques03(String name) {
        this(21);
        this.name = name;
        System.out.println("Name: " + name);
    }

    //Private constructor
    private Ques03(int age) {
        this(61, "BCA");
        this.age = age;
        System.out.println("Age: " + age);
    }

    //Protected constructor.
    //NOTE: Constructor here looks like method, but it is not. Constructor does not have return type. So we can only pass arguments not return type.
    protected Ques03(int rollNumber, String course) {
        this.rollNumber = rollNumber;
        this.course = course;
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        System.out.println("Student's Details");
        Ques03 obj = new Ques03();
    }
}
