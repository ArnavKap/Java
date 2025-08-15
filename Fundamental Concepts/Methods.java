//Working with methods in the java class

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // calling of the Sum function
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Printing with void Function:");
        Sum(); //to call the method directly in a static method the called method should also be static
        System.out.println("Printing with return type function:");
        System.out.println(Sum1());
        System.out.println("printing with string return type function");
        System.out.println(Hello());
        System.out.println("Printing with return type and passing the arguments");
        System.out.println(Sum_with_Args(num1,num2));

    }
    static void Sum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first Number:");  //Function with no return type used for printing the statement
        int Num1 = input.nextInt();
        int Num2 = input.nextInt();
        System.out.println("Sum of two Numbers:" + (Num1+Num2));

    }
    static int Sum1()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first Number:"); //Function with the integer return type
        int Num1 = input.nextInt();
        int Num2 = input.nextInt();
        return  Num1 + Num2;
    }
    static String Hello()
    {
        Scanner input = new Scanner(System.in);  //Function with the integer return type
        String test = input.nextLine();
        return test;
    }
    static int Sum_with_Args(int a , int b)
    {
        return a+b;
    }

}
