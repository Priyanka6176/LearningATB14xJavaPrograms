package ex_11_While_Loop;

public class Lab100_While_Loop_Interview_Que1 {
    public static void main(String[] args) {
        int i = 0;
        while (i > 0) {
            //
            System.out.println("Enter");
            System.out.println(i);
            i++;
        }
    }
    //while (i > 0) → The condition checks if i is greater than 0.
    //Since i starts at 0, the condition i > 0 is false from the beginning.
    //Therefore, the loop never runs. Nothing is printed, and the program ends.
}
