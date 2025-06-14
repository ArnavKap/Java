//Taking inputs in java from CLI andd working with datatyeps
import java.util.Scanner;

public class Input_and_Datatypes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // These are the Primitive Datatype

        int a = input.nextInt();//taking an integer input
        System.out.println(a);
        float b = input.nextFloat();// taking a float input
        System.out.println(b);
        double c = input.nextDouble(); //taking a double input
        System.out.println(c);
        long d =  input.nextLong(); //taking a long input
        System.out.println(d);
        boolean e = input.nextBoolean();// taking a boolean input
        System.out.println(e);
        char f = input.next().charAt(0); // specifically to tak a single char input
        System.out.println(f);

        // These are the Non primitive datatype

        String g = input.next();// input  breaks after one space
        input.nextLine(); //this is used to flush the input buffer after space like abc pqr only to be used after.next()
        System.out.println(g);
        String h = input.nextLine(); // take the input with all the spaces as well

        System.out.println(h);

        /* There is also a concept of wrapper classes in which the primitive datatypes have classes
           where you can add function like a.function(); which cannot be done in the primitive datatype
           as they are not part of the classes */

       /*   This will be the output of the program
            1
            1
            123.2
            123.2
            21324546.2343567
            2.13245462343567E7
            123456
            123456
            false
            false
            wer
            w
            abc pqr
            abc
            abc pqr
            abc pqr */
     }
}