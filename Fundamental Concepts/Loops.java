// Working with the Different types of basic loops
public class Loops {
    public static void main(String[] args) {
        //for loop
        System.out.println("Output of the for loop");
        for (int i=0;i<5;i++)
        {
            System.out.println(i);
        }
        //while loop
        System.out.println("Output of the while loop");
        int i = 0;
        while (i<5)
        {
            System.out.println(i);
            i++;
        }
        //do while
        System.out.println("Output of the do while loop");
        i=0;
        do {
            System.out.println(i);
            i++;
        }
        while(i<5);

    }
}
