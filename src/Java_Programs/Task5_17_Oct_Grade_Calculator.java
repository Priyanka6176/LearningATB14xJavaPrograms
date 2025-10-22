package Java_Programs;

import java.util.Scanner;

public class Task5_17_Oct_Grade_Calculator {
    public static void main(String[] args) {
        // Calculate Grade Based on Marks. (Follow Below Steps to Write Program.):
        //90 - 100 A+
        //80 - 89 A
        //70 - 79 B
        //60 - 69 C
        //50 - 59 D
        //40 - 49 E
        //Below 40 Fail

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your Marks :");
            int marks= scanner.nextInt();
            String grade = "";
            if (marks >= 90  && marks <=100){
                grade="A+";
            } else if (marks >= 80 && marks <= 89) {
                grade="A";
            }
            else if (marks >= 70 && marks <= 79) {
                grade="B";
            }
            else if (marks >= 60 && marks <= 69) {
                grade="C";
            }
            else if (marks >= 50 && marks <= 59) {
                grade="D";
            }
            else if (marks >= 40 && marks <= 49) {
                grade="E";
            }
            else{
                System.out.println("Fail");
            }
            System.out.println(grade);
    }
}
