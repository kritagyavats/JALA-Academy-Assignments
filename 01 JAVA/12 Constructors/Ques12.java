//Ques 2) Call the constructors(both default and argument constructors) of super class from a child class.

package A12_Constructors;

//Creating child subclass (PatientDetails) extending Parent Class (Patient) from Ques 1
class PatientDetails extends Patient {
    String hospitalName;
    int bedNumber;

    //Calling parent class constructor using super() keyword
    PatientDetails() {
        super();
    }

    //Calling parent class argument constructor using super() keyword
    PatientDetails(String name) {
        super(name);
    }

    //Calling parent class argument constructor using super() keyword
    PatientDetails(int age, int weight, int bedNumber, String hospitalName) {
        super(age, weight);
        this.bedNumber = bedNumber;
        this.hospitalName = hospitalName;
        System.out.println("Bed Number: " + this.bedNumber);
        System.out.println("Hospital: " + this.hospitalName);
    }
}

public class Ques02 {
    public static void main(String[] args) {
        new PatientDetails();
        new PatientDetails("Rohit Kumar");
        new PatientDetails(22, 72, 313, "AIIMS");
    }
}
