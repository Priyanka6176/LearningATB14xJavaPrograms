package ex_06_Ternary_Operator;

public class Lab052_FindMaxNoFromTwoValues {
    public static void main(String[] args) {
        // Find the maximum number between two numbers.
        int x = 10;
        int y = 20;
       System.out.println(Math.max(x,y)); // >> this can be use its a internal method it will find the max value

        int max = x > y ? x : y;
        System.out.println(max);
    }
}
