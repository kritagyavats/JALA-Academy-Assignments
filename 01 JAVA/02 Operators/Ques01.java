//Ques 1) Write a function for arithmetic operators(+,-,*,/)

package A02_Operators;

import java.util.Scanner;

public class Ques01 {

    static void add(float a, float b) {
        float add = a+b;
        System.out.println(a + " + " + b + " = " + add);
    }

    static void subtract(float a, float b) {
        float sub = a-b;
        System.out.println(a + " - " + b + " = " + sub);
    }

    static void multiply(float a, float b) {
        float mul = a*b;
        System.out.println(a + " * " + b + " = " + mul);
    }

    static void divide(float a, float b) {
        float div = a/b;
        System.out.println(a + " / " + b + " = " + div);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        float num1 = scan.nextFloat();
        System.out.print("Enter Second Number: ");
        float num2 = scan.nextFloat();

        add(num1, num2);
        subtract(num1, num2);
        multiply(num1, num2);
        divide(num1, num2);
    }
}
