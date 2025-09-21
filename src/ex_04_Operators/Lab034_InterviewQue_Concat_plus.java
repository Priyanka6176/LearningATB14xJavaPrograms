package ex_04_Operators;

public class Lab034_InterviewQue_Concat_plus {
    public static void main(String[] args) {
        String first_name = "Java";
        String last_name = "Learning";

        int a = 10;
        int b = 10;

        System.out.println(first_name + last_name + a + b);
        System.out.println(a + b + first_name + last_name);
        System.out.println(first_name+ a + b + last_name);
        System.out.println(first_name+ (a + b) + last_name);
        // BODMAS - Bracket of Div, mul, add, sub
        System.out.println(first_name + last_name + (a + b));
    }
}
