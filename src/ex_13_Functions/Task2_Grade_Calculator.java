package ex_13_Functions;

import java.util.Scanner;

public class Task2_Grade_Calculator {
    //Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
    //A: 90-100
    //B: 80-89
    //C: 70-79
    //D: 60-69
    //F: 0-59
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Marks :");
        int marks= scanner.nextInt();
        String grade = "";
        if (marks >= 90  && marks <=100){
            grade="A";
        } else if (marks >= 80 && marks <= 89) {
            grade="B";
        }
        else if (marks >= 70 && marks <= 79) {
            grade="C";
        }
        else if (marks >= 60 && marks <= 69) {
            grade="D";
        }
        else if (marks >= 0 && marks <= 59) {
            grade="E";
        }
        System.out.println(grade);
    }
}
