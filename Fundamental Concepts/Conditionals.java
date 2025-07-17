import java.util.Scanner;

// Working with conditional Statements
public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int test = input.nextInt();

        if(test == 0)
        {
            System.out.println(test);
        }
        else if (test == 1) {
            System.out.println(test);
        }
        else
        {
            System.out.println("Not a Binary Digit");
        }
    }
}
