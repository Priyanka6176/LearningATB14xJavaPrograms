package ex_02_Java_Basics;

public class Lab021_Multiple_Main_Methods {
    public static void main(String[] args) {

    }

    public static void main(String args) {

    }

    public static void main(int args) {

    }
    //JVM only recognizes one main (with String[] args). The other versions are just extra methods
    //All other versions are just method overloading of main—they compile but won’t be recognized by JVM as the program’s starting point

}
