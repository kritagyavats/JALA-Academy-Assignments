//Ques 6) Write a program to print even number between 10 and 100 using while

package A03_Loops;

public class Ques06 {
    public static void main(String[] args) {
        int i = 10;
        System.out.print("Even Numbers: ");
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
