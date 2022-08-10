/*Ques 4) Create a class with PUBLIC fields and methods.
Access the public methods and fields from any class in the same package or different package.
*/

//Check in morning

package A08_AccessModifiers;

class personalDetails {
    public String name;
    public int age;
    public String height;
    public double weight;

    public void details() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
    }
}

public class Ques04 {
    public static void main(String[] args) {
        System.out.println("---Personal Measures---");
        personalDetails obj = new personalDetails();
        obj.name = "Kritagya Vats";
        obj.age = 22;
        obj.height = "6'2";
        obj.weight = 75.5;
        obj.details();
    }
}
