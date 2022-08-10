//Ques 7) Print the smaller and larger number

package A02_Operators;

import java.util.Scanner;

public class Ques07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = scan.nextInt();

        int min, max;

        if (num1 > num2) {
            max = num1;
            min = num2;
        }
        else {
            min = num1;
            max = num2;
        }

        System.out.println("Larger Number: "+ max);
        System.out.println("Smaller Number: "+ min);
    }
}
