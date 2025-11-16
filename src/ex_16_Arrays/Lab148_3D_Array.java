package ex_16_Arrays;

public class Lab148_3D_Array {
    public static void main(String[] args) {
        int[][][] arr_3d = {
                {
                        {1, 2, 3},
                        {4, 5, 6}
                },
                {
                        {7, 8, 9},
                        {10, 12, 12}
                }
        };

        System.out.println("Element at arr[1][0][2]: " + arr_3d[1][0][2]); // Output: 9
    }

    //arr[1] → second block:
    //{
    //    {7, 8, 9},
    //    {10, 12, 12}
    //}
    //arr[1][0] → first row of that block:
    //{7, 8, 9}
    //arr[1][0][2] → third element in that row: 9
}
