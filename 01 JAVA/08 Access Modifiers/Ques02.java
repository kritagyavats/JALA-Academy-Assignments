//Ques 2) Create a class with DEFAULT fields and methods. Access these fields and methods from any other class in the same package.

package A08_AccessModifiers;

class vehicleDetails {
    String model;
    int makeYear;
    int regisNumber;

    void details() {
        System.out.println("Model Name: " + model);
        System.out.println("Make Year: " + makeYear);
        System.out.println("Registration Number: " + regisNumber);
    }
}

public class Ques02 {
    public static void main(String[] args) {
        System.out.println("---Vehicle Basic Details---");
        vehicleDetails obj = new vehicleDetails();
        obj.model = "Volkswagen Polo";
        obj.makeYear = 2019;
        obj.regisNumber = 4091;
        obj.details();
    }
}
