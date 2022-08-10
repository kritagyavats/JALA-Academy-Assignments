//Ques 1) How to create a class, object, method and its signature.

package A01_Java_Basics;

//Creating CLASS
public class Ques01 {

    //Creating METHOD
    static void method() {
        String str = "Kritagya Vats";
        System.out.print(str);
    }

    public static void main(String[] args) {
        //Creating OBJECT
        Ques01 obj = new Ques01();

        obj.method();
    }
}
