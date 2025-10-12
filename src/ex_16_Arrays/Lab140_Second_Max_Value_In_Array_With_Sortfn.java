package ex_16_Arrays;

import java.util.Arrays;

public class Lab140_Second_Max_Value_In_Array_With_Sortfn {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};//100,34
        Arrays.sort(numbers); //  This will sort the array in ascending order [1, 3, 4, 10, 12, 32, 34, 100]
        System.out.println(numbers[numbers.length - 2]);
        //numbers.length = 8
        //numbers[6] = 34
    }
}
