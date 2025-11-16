package ex_16_Arrays;

public class Lab146_Second_Highest_value_In_Array_Without_SortFn {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 67, 23, 89, 45, 89};
        int highest  = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for(int num : numbers){
            if(num > highest){
                secondHighest = highest;
                highest = num;
            }
            else if( num > secondHighest && num !=highest){
                secondHighest = num;
            }
        }

        System.out.println(secondHighest);
        System.out.println(highest);

    }
}
