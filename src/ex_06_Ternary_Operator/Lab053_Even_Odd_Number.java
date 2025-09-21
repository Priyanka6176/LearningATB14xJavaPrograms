package ex_06_Ternary_Operator;

public class Lab053_Even_Odd_Number {
    public static void main(String[] args) {
        //  Step 1- Check the Input , Output -> data type
        int num = 14;

        //  // Step 2 ->
        //        // num%2 == 0 >  if this condition true then value would be even else odd.
        String result = (num%2 == 0) ? "even" : "odd";
        System.out.println(result);
    }
}
