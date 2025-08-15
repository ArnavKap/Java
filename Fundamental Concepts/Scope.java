//Contains about the various scopes
public class Scope {
    static int x = 10;
    public static void main(String[] args) {
        int x = 20;// Global Scope
        System.out.println("Main Scope Printed:" + x);//global scope got shadowed
        {
            x= 30;
            System.out.println("Scope inside block is printed:"+ x);
        }
        //note any variable initialised inside the block will be destroyed as soon as the block ends
        Print_value();
    }

    static void Print_value() {

        System.out.println("Global Scope Printed: "+ x);
        int x = 40;//Scope will be Created only after the initialisation of the variable
        System.out.println("Function Scope Variable is printed :"+ x);
    }


}
