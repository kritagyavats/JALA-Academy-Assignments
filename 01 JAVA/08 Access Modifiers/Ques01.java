/*Ques 1) Create a class with PRIVATE fields, private method and a main method. Print the fields in main method. Call the private method in main method.
Create a subclass and try to access the private fields and methods from subclass.
*/

package A08_AccessModifiers;

public class Ques01 {
    private String name = "Kritagya Vats";
    private int rollNumber = 61;
    private String course = "BCA";

    private void details() {
        System.out.println("---Student Basic Details---");
    }

    public static void main(String[] args) {
        Ques01 obj = new Ques01();
        obj.details();
        System.out.println("Name: " + obj.name);
        System.out.println("Roll: " + obj.rollNumber);
        System.out.println("Course: " + obj.course);

    }
}
