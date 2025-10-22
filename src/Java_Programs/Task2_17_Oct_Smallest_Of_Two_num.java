package Java_Programs;

import java.util.Scanner;

public class Task2_17_Oct_Smallest_Of_Two_num {
    public static void main(String[] args) {
        //Find the Smallest of Two Numbers
        System.out.println("Enter Two No.");
        Scanner sc= new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a>b){
            System.out.println("Smallest Number is "+ b);
        }
        else if(b>a){

            System.out.println("Smallest number is "+ a);
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
