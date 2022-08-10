/*Ques 3) Create a class with PROTECTED fields and methods. Access these fields and methods from any other class in the same package.
Also, Access the PROTECTED fields and methods from child class located in a different package.
Access the PROTECTED fields and methods from any class in different package.
*/

package A08_AccessModifiers;

public class Ques03 {
    protected String brandName;
    protected String modelName;
    protected double price;
    protected int launchYear;

    protected void details() {
        System.out.println("Brand Name: " + brandName);
        System.out.println("Model Name: " + modelName);
        System.out.println("M.R.P.: " + price + "/-");
        System.out.println("Launch Year: " + launchYear);
    }
}

class mobile {
    public static void main(String[] args) {
        System.out.println("---Mobile Details---");
        Ques03 obj = new Ques03();
        obj.brandName = "OnePlus";
        obj.modelName = "10R";
        obj.price = 39998.55;
        obj.launchYear = 2022;
        obj.details();
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Creating another class in different package.

package A08_AccessModifiers.Ques03B;

import A08_AccessModifiers.Ques03;

public class Ques03B extends Ques03 {
    public static void main(String[] args) {
        System.out.println("---Mobile Details---");
        Ques03B obj = new Ques03B();
        obj.brandName = "Redmi";
        obj.modelName = "Note 10 Pro";
        obj.price = 18999.00;
        obj.launchYear = 2021;
        obj.details();
    }
}
