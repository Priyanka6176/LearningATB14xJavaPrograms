package Java_Programs;

import java.util.Scanner;

public class Task4_17_Oct_Leap_Year_Find {
    public static void main(String[] args) {
        // Check if a Year is a Leap Year
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year");
        if (input.hasNextInt()) {
            int year = input.nextInt();

            if (year <= 0) {
                System.out.println("Please enter a valid positive year.");
            } else {

                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            }
        } else {

            System.out.println("Invalid input! Please enter a valid numeric year.");
        }
    }
}
