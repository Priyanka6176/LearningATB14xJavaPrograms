package ex_14_Strings;

import java.util.Scanner;

public class Task1_Program_Reverse_String_Without_BuiltIn_Fn {
    public static void main(String[] args) {
// Write a program to reverse a string without using inbuilt functions.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string, i will reverse it");
        String user_input = scanner.next();

        String reverse_user_input = "";
        int i = user_input.length() - 1;
        while(i >= 0){

            reverse_user_input = reverse_user_input + user_input.charAt(i);
            i--;
        }

        System.out.println(reverse_user_input);
    }
}
