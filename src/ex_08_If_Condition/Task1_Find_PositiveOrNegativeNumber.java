package ex_08_If_Condition;

import java.util.Scanner;

public class Task1_Find_PositiveOrNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Number is Positive");
        } else if (num < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }
    }

}
