public class EvenOdd {
    public static void main(String[] args) {
        int n = 8;

        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
/*a = 10
b = 5*/

// SWAP NUMBERS WITHOUT USING ADDITIONAL VARIABLE

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;

        a = a + b;   // 15
        b = a - b;   // 5
        a = a - b;   // 10

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
