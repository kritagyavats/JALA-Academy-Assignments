//Ques 5) Programs on Logical AND,OR operator and Logical NOT

package A02_Operators;

import java.util.Scanner;

public class Ques05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter Third Number: ");
        int num3 = scan.nextInt();
        System.out.println();

        //AND OPERATOR
        System.out.println("Logical AND Operator");
        System.out.print(num1+" > "+num2+" && "+num1+" > "+num3+" --> ");
        System.out.println(num1>num2 && num1>num3);
        System.out.print(num1+" < "+num2+" && "+num1+" > "+num3+" --> ");
        System.out.println(num1<num2 && num1>num3);
        System.out.print(num1+" > "+num2+" && "+num1+" < "+num3+" --> ");
        System.out.println(num1>num2 && num1<num3);
        System.out.print(num1+" < "+num2+" && "+num1+" < "+num3+" --> ");
        System.out.println(num1<num2 && num1<num3);
        System.out.println();

        //OR OPERATOR
        System.out.println("Logical OR Operator");
        System.out.print(num1+" > "+num2+" || "+num1+" > "+num3+" --> ");
        System.out.println(num1>num2 || num1>num3);
        System.out.print(num1+" < "+num2+" || "+num1+" > "+num3+" --> ");
        System.out.println(num1<num2 || num1>num3);
        System.out.print(num1+" > "+num2+" || "+num1+" < "+num3+" --> ");
        System.out.println(num1>num2 || num1<num3);
        System.out.print(num1+" < "+num2+" || "+num1+" < "+num3+" --> ");
        System.out.println(num1<num2 || num1<num3);
        System.out.println();

        //NOT OPERATOR
        System.out.println("Logical NOT Operator");
        System.out.print("!("+num1+" > "+num2+") --> ");
        System.out.println(!(num1>num2));
        System.out.print("!("+num1+" < "+num2+") --> ");
        System.out.println(!(num1<num2));
        System.out.print("!("+num1+" > "+num3+") --> ");
        System.out.println(!(num1>num3));
        System.out.print("!("+num1+" < "+num3+") --> ");
        System.out.println(!(num1<num3));
    }
}
