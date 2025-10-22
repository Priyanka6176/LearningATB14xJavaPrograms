package Java_Programs;

import java.util.Scanner;

public class Task3_17_Oct_Smallest_Of_Three_num {
    public static void main(String[] args) {
        //Find the Smallest of Three Numbers
        System.out.println("Enter Three No.");
        Scanner sc= new Scanner(System.in);

        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a<b && a<c){
            System.out.println("Smallest number is "+ a);
        }
        else if(b<c && b<a){

            System.out.println("Smallest number is "+ b);
        }
        else{
            System.out.println("Smallest number is "+ c);
        }
    }
}
