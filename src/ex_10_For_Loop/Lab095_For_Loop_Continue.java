package ex_10_For_Loop;

public class Lab095_For_Loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) {
            if(i == 5){
                continue;
            }
            System.out.println(i);  // 0,1,2,3,4
        }
        //continue skips the current iteration and moves to the next value of i
        //So when i == 5, the loop skips the System.out.println(i) and continues with i = 6
    }
}
