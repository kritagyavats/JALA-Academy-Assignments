//Ques 12) Print gender (Male/Female) program according to given M/F using switch

package A03_Loops;

import java.util.Scanner;

public class Ques12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your Gender (M/F): ");
        char gen = scan.next().charAt(0);
        char gender = Character.toUpperCase(gen);

        switch (gender) {
            case 'M':
                System.out.print("Male");
                break;

            case 'F':
                System.out.print("Female");
                break;
        }
    }
}
