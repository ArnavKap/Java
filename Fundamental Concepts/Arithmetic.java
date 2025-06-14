// File contains the Basic Arithmetic Operations in Java

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // starting with the basic operations
        System.out.println(num1 + num2); // Addition
        System.out.println(num1 - num2); // Subtraction
        System.out.println(num1 * num2); // Multiply
        System.out.println(num1 / num2); // Division
        System.out.println(num1 % num2); // Modulus

        // In Integer the division is called floor division to do an exact one convert to double or float
        // Modulus Gives the Remainder of the Function
    }
}
