package Java_Programs;

import java.util.Scanner;

public class Task6_17_Oct_Check_Character_Is_Alphabet {
    public static void main(String[] args) {
        // Check if a Character is an Alphabet
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character: ");
        char c = scanner.next().charAt(0);
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println(c+ " is an alphabet");
        } else {
            System.out.println(c+ " is not an alphabet");
        }

    }
}
