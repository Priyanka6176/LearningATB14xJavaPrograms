package ex_07_Increment_Decrement_Operators;

public class Lab059_PostIncrement {
    public static void main(String[] args) {

        // POST increment  = Print first and then increase.
        int a_post = 10;
        int b = a_post++;
        System.out.println(a_post);
        System.out.println(b);

        // ERT ( Exp and Result Table)
        // LNo |  a_post | b
        // line 7 |  10 | NA
        // line 8  |  11  | 10
        // line 9  |  11  | 10


    }
}
