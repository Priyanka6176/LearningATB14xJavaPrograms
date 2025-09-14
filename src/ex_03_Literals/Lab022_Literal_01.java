package ex_03_Literals;

public class Lab022_Literal_01 {
    public static void main(String[] args) {

        int age = 65;
        // 65 is an integer literal assigned to variable age

        final float pi = 3.14f;
        //  3.14f is a float literal.
        // pi is marked as final, so its value cannot be changed once assigned

        final int girl_age = 18; //18 is an integer literal
        //girl_age = 19; //girl_age is declared as final, so if you try girl_age = 19; you’ll get a compile-time error

        float pi0 = 3.14f;
        float pi2 = 3.14F;
        float x = 10.00f;
    }
}
