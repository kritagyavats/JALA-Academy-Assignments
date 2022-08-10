//Ques 5) Define the local and global variables with the same name and print both variables and understand the scope of the variables.

package A01_Java_Basics;

public class Ques05 {
    int N = 4;

    static void localVariable() {
        int N = 5;

        //LOCAL VARIABLE
        System.out.println("Local variable N: "+ N);
    }

    public static void main(String[] args) {
        Ques05 obj = new Ques05();

        //GLOBAL VARIABLE
        System.out.println("Instance variable N: "+ obj.N);

        obj.localVariable();
    }
}
