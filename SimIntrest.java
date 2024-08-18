package ChalengeTwo;

import java.util.Scanner;

public class SimIntrest {
    public static void main(String[] args) {
        SI();
        
    }
    public static void SI(){
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Principle Amount: ");
        int p = input.nextInt();
        System.out.print("Enter The Time Period: ");
        int t = input.nextInt();
        System.out.print("Enter The Rate of interst: ");
        float r = input.nextFloat();
        double SI = p * t * r / 100;
        System.out.print("Simple Intrest is: " + SI);
        // return;
    }
}


