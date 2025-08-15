import java.util.Scanner;

//Working with switch case statements
public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();

        //Normal Switch Case
        switch (fruit)
        {
            case "mango":
                System.out.println("mango");
                break;
            case "apple":
                System.out.println("apple");
                break;
            default:
                System.out.println("enter a fruit");
        }

        //Enhanced switch case
        switch(fruit)
        {
            case "mango" -> System.out.println("mango");
            case "apple" -> System.out.println("apple");
            default -> System.out.println("Enter a Fruit");

        }


    }
}
