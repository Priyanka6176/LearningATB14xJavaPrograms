package ex_16_Arrays;

public class Lab142_Two_Dimentions_Array_Creation {
    public static void main(String[] args) {
        int[][] array_2d_old = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}

        }; // A 3x3 matrix is directly initialized


        int[][] predefined = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


        int[][] array;
        array = new int[][] { {10, 20}, {30, 40}, {50, 60} };
        //You’re first declaring the array (int[][] array) and then assigning it using new int[][] {...}.
        // This is necessary if you want to separate declaration and initialization.
        //Dimensions: 3 rows × 2 columns
    }
}
