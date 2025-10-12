package ex_11_While_Loop;

public class Lab103_While_Loop_Check {
    public static void main(String[] args) {
        int i = 0;
        while (i < 0) {
            System.out.println(i);
            i++;
        }
        //Since i is 0, and 0 is not less than 0, the condition is false.
        //So, the loop body does not execute even once.
    }
}
