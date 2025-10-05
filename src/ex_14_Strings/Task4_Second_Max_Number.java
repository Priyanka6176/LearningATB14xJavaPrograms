package ex_14_Strings;

import java.util.Arrays;

public class Task4_Second_Max_Number {
    /*I want you to find the second maximum number in this array
    int[] numbers = {12, 34, 10, 1, 100, 3*/
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3};
        int max = numbers[0];
        int secondMax = numbers[1];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];
            } else if (numbers[i] > secondMax && numbers[i] != max) {
                secondMax = numbers[i];
            }
        }
        System.out.println("Second maximum number is: " + secondMax);


    }}
