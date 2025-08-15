// Working of the swapping inside java
public class swapping {
    public static void main(String[] args) {
        // in java no concept of pass By reference only pass by value so wapping inside a fucnction will not work
        int [] swap = new int[2];
        int a = 10;
        int b = 20;
        swap[0] = a;
        swap[1] = b;
        System.out.println("Before swapping :" + a + " "+ b);
        swap = swapping_function(swap);
        a= swap[0];
        b= swap[1];
        System.out.println("After swapping :" + a + " "+ b);

    }

    private static int[] swapping_function(int[] swap) {
        int temp = swap[0];
        swap[0] = swap[1];
        swap[1] = temp;
        return swap;
    }
}
