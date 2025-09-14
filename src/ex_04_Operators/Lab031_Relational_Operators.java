package ex_04_Operators;

public class Lab031_Relational_Operators {
    public static void main(String[] args) {
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        int a = 10;
        int b = 30;
        boolean c = a > b; // // 10> 30
        System.out.println(c);

        int age_priyanka = 28;
        int age_akshay = 29;

        boolean result = age_akshay >= age_priyanka;
        System.out.println(result);
    }
}
