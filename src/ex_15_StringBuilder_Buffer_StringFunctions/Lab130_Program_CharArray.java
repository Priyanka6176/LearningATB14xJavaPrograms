package ex_15_StringBuilder_Buffer_StringFunctions;

import java.util.Scanner;

public class Lab130_Program_CharArray {
    public static void main(String[] args) {
        // Write a program to reverse a string without using inbuilt functions.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input string, i will reverse it");
        String user_input = scanner.next();



        String reverse_user_input = "";

        char[] arr = user_input.toCharArray(); // Converts the string to a character array


        for (int i = arr.length - 1; i >= 0; i--) {
            reverse_user_input = reverse_user_input + arr[i]; //Concatenates characters in reverse
        }

        System.out.println(reverse_user_input);
    }
}
