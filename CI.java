package ChalengeTwo;

import java.util.Scanner;

public class CI {
   public static void main(String[] args) {
     @SuppressWarnings("resource")
    Scanner input = new Scanner(System.in);
        System.out.print("Enter The Principle Amount: ");
        int p = input.nextInt();
        System.out.print("Enter The Time Period: ");
        int t = input.nextInt();
        System.out.print("Enter The Rate of interst: ");
        float r = input.nextFloat();
        double CI = p *(1+ r) * t / 100;
        System.out.print("Simple Intrest is: " + CI);
    }
}
