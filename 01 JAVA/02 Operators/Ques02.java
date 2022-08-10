//Ques 2) Write a method for increment and decrement operators(++,--)

package A02_Operators;

import java.util.Scanner;

public class Ques02 {
    static void preIncrement(int m, int n) {
        int preInc = m + (++n);
        System.out.println(m + " + " + n + " = " + preInc);
    }

    static void preDecrement(int m, int n) {
        int preDec = m + (--n);
        System.out.println(m + " + " + n + " = " + preDec);
    }

    static void postIncrement(int m, int n) {
        int postInc = m + (n++);
        System.out.println(m + " + " + n + " = " + postInc);
    }

    static void postDecrement(int m, int n) {
        int postDec = m + (n--);
        System.out.println(m + " + " + n + " = " + postDec);
    }

    public static void main(String[] args) {
        int num1 = 59;
        int num2 = 39;

        System.out.println("After PreIncrement    (++n)");
        preIncrement(num1, num2);
        System.out.println("After PreDecrement    (--n)");
        preDecrement(num1, num2);
        System.out.println("After PostIncrement   (n++)");
        postIncrement(num1, num2);
        System.out.println("After PostDecrement   (n--)");
        postDecrement(num1, num2);

    }
}
