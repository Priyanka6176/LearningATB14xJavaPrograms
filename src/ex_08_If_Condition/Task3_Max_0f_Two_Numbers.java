package ex_08_If_Condition;

import java.util.Scanner;

public class Task3_Max_0f_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Maximum is: " + num1);
        } else if (num2 > num1) {
            System.out.println("Maximum is: " + num2);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}
