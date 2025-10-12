package ex_14_Strings;

public class Lab118_String_Interview_Que {
    public static void main(String[] args) {

        String s1 = "Hello";
        String s4 = "Hello";
        String s10 = "Hello";
        String s11 = "hello";
        // For above 4 lines (String Constant Pool>> Total = 2)
        //"Hello" → appears multiple times, but added once to the String Constant Pool
        //"hello" → different in case (Java is case-sensitive), so it's another unique literal

        String s2 = new String("Hello"); //creates 1 object in heap
        String s3 = new String("Hello"); //creates another object in heap
        String s5 = new String("hello"); //another heap object
        // 3 objects will get create in Heap
    }
}
