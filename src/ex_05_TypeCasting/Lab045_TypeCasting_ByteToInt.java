package ex_05_TypeCasting;

public class Lab045_TypeCasting_ByteToInt {
    public static void main(String[] args) {
        byte b = 10;
        // int a = b; // // Valid syntax - Implicit - Casting -> Widening ->
        int a = (int) b; // Explicit Casting - Widening
        System.out.println(a);



        byte c = 10;
        int d = b; // Valid Syntax -> Widening -> Implicit Casting - Automatically done.
        int d1 = (int) b; // Valid Syntax -> Widening -> Explicit Casting - not requred

    }
}
