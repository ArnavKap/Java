// File Contains the basic concepts about type casting
/* Typecasting is of two types implicit and explicit
    => Implicit is used where the compiler automatically changes the type of the data
       Conditions for typecasting is :
            Destination types size > Source Type size during any operation
    => Explicit type casting is where you manually convert the datatype of the source to destination and is
       diminished it will leave the data outside the size and can show error in non-compatible conversion.

       Syntax:   int abc = (int)(value or variable of any other compatible type);
 */

public class Typecasting {
    public static void main(String[] args) {

        //automatic type casting
        int num1 = 10;
        System.out.println("num1 = " + num1);
        float num2 = 20;
        System.out.println("num2 = " + num2);

        //explicit type casting
        int num3 = (int)20.36;
        System.out.println("num3 = " + num3); // this will skip the .36 and print only 20

        //exception cases
        byte b = 5;
        b = (byte)(b*20);
        System.out.println("b = " + b);
        /* In this case when doing intermediate calculation java compiler automatically converts byte to int
           in order to not throw the error when calculating hence we need and explicit conversion when assigning the
           value converted to int back to byte.
         */


    }
}
