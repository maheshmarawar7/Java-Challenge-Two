package ChalengeTwo;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The value of base: ");
        double B = input.nextDouble();
        System.out.print("Enter the value of height: ");
        double H = input.nextDouble();
        double a = 0.5*B*H;
        System.out.println("Area Of Trangle is: "+ a);
    }
}
