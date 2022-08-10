/*Ques 1)
a) Create an abstract class with abstract and non-abstract methods.
b) Create a subclass for an abstract class. Create an object in the child class for the abstract class and access the non-abstract methods.
c) Create an instance for the child class in child class and call abstract methods.
d) Create an instance for the child class in child class and call non-abstract methods.
*/

package A09_AbstractClass;

//Creating an abstract class
abstract class carDetail {

    //Abstract Method
    abstract void carModel();

    //Non-Abstract Method
    void fuel() {
        System.out.println("Petrol");
    }
}

//Creating a subclass for an abstract class
public class Ques01 extends carDetail {
    void carModel() {
        System.out.println("Toyota Fortuner");
    }

    public static void main(String[] args) {
        //Creating an object for an abstract class
        carDetail obj = new Ques01();
        //Accessing the non-abstract method
        obj.fuel();

        //Creating an instance for child class
        Ques01 obj2 = new Ques01();

        //Calling an abstract method
        System.out.print("Car Model: ");
        obj2.carModel();

        //Calling the non-abstract method
        System.out.print("Fuel Type: ");
        obj2.fuel();
    }
}
