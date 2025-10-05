package ex_14_Strings;

import java.util.Scanner;

public class Task2_No_Of_Word_In_String {
    public static void main(String[] args) {
        //Count the Number of Words in a String.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The String");
        String str = scanner.nextLine();
        int count = 0;
        boolean word = false;
        for (int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && !word) {
                word = true;
                count++;
            } else if (ch == ' ') {
                word = false;
            }
        }
        System.out.println ("Number of words in String: " + count);

        }
    }

