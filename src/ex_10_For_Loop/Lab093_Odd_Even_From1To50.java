package ex_10_For_Loop;

public class Lab093_Odd_Even_From1To50 {
    public static void main(String[] args) {
        // TO find the even numbers from 1 to 50
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                //             if (i % 2 != 0) { - Logic for odd
                System.out.println("Even =>" + i);
            }

        }
    }
}
