package ex_10_For_Loop;

public class Lab094_For_Loop_Break {
    public static void main(String[] args) {
        for (int i = 0; i < 50; i++) { // 0 to 49, Times : 50
            //            System.out.println(i);

            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
//The loop starts at i = 0 and would go up to i = 49 (total 50 times)...
//BUT: you have a break when i == 5, which stops the loop early.
