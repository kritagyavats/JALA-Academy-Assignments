//Ques 13) Program for multiple if else statement(The Largest number in 10,20 and 30)

package A03_Loops;

public class Ques13 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        System.out.print("Largest Number: ");
        if (num1 > num2 && num1 > num3) {
            System.out.print(num1);
        }
        else if (num2 > num1 && num2 > num3) {
            System.out.print(num2);
        }
        else {
            System.out.print(num3);
        }
    }
}
