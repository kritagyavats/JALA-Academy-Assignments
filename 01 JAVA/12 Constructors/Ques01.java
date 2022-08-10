//Ques 1) Write a class with a default constructor, one argument constructor and two argument constructors. Instantiate the class to call all the constructors of that class from a main class.

package A12_Constructors;

class Patient {
    String name;
    int age;
    int weight;

    //Default Constructor
    Patient() {
        System.out.println("Patient Details");
    }

    //One Argument Constructor
    Patient(String name) {
        this.name = name;
        System.out.println("Name: " + this.name);
    }

    //Two Argument Constructor
    Patient(int age, int weight) {
        this.age = age;
        this.weight = weight;
        System.out.println("Age: " + this.age);
        System.out.println("Weight: " + this.weight);
    }
}

public class Ques01 {
    public static void main(String[] args) {
        new Patient();
        new Patient("Rohit Kumar");
        new Patient(22, 72);
    }
}
