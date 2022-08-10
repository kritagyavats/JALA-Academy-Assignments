//Ques 6) Print all the static, instance variables in main method.

package A05_Static;

public class Ques06 {

    static int statVar1 = 45;
    static char statVar2 = '@';

    int instVar1 = 36;
    char instVar2 = '&';

    public static void main(String[] args) {

        //Printing Static Variables
        System.out.println("Static Variable 1: " + statVar1);
        System.out.println("Static Variable 2: " + statVar2);

        //Printing Instance Variables
        Ques06 obj = new Ques06();
        System.out.println("Instance Variable 1: " + obj.instVar1);
        System.out.println("Instance Variable 2: " + obj.instVar2);
    }
}
