//Ques 6) Program for relational operators (<,<=, >, >=)

package A02_Operators;

import java.util.Scanner;

public class Ques06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = scan.nextInt();

        System.out.println(num1 + " > " + num2 + "  --> " + (num1>num2));
        System.out.println(num1 + " < " + num2 + "  --> " + (num1<num2));
        System.out.println(num1 + " >= " + num2 + " --> " + (num1>=num2));
        System.out.println(num1 + " <= " + num2 + " --> " + (num1<=num2));
    }
}
