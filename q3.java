
package ChalengeTwo;

import java.util.Scanner;

// @SuppressWarnings("unused")
public class q3 {
    public static void main(String[] args) {
        // primeter of a rectangular
        // int A, B, C, D;
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER THE VALUE OF A: ");
        int A = input.nextInt();
        System.out.print("ENTER THE VALUE OF B: ");
        int B = input.nextInt();
        System.out.print("ENTER THE VALUE OF C: ");
        int C = input.nextInt();
        System.out.print("ENTER THE VALUE OF D: ");
        int D = input.nextInt();
        int ABCD =  A + B + C + D;
        System.out.print("Perimeter of rectangular ABCD: "+ABCD);
    }
}
