package ex_16_Arrays;

public class Lab136_Array_Find_Max_Min_Number {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        // logic

//        Arrays.sort(array);
//        System.out.println(array[array.length-1]);

//        int max = array[0];
//        for (int i = 0; i < array.length; i++) {
//                if(array[i] > max){
//                    max = array[i];
//                }
//        }
//
//        System.out.println(max);

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println(min);

    }
}
