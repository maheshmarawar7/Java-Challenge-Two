package ChalengeTwo;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter A tempreture in Fahrenheiet: ");
        int f = input.nextInt();
        int c = (f-32) *5/9;
        System.out.println("Temp in Celsius is: "+c);
    }
}