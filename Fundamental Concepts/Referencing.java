// How does the primitive and object referencing work in java
public class Referencing {
    public static void main(String[] args) {
        int x= 10;
        String test = "test";
        int [] nums ={10};
        System.out.println("Before Function Call:\n "+ x + "\n" + test+"\n"+ nums[0]);
        ref_function(x, test,nums);
        System.out.println("After Function Call :");
        System.out.println(x + "\n" + test+"\n"+ nums[0]);
        // The value of string did not change even though being an object is because strings are immutable.

    }

    private static void ref_function(int b, String test, int[] arr) {
        System.out.println("In Function Call:");
        b=20;
        System.out.println(b);
        test = "abc";
        System.out.println(test);
        arr[0]=20;
        System.out.println(arr[0]);


    }
}
