package ex_15_StringBuilder_Buffer_StringFunctions;

public class Lab128_String_Builder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Hello World
        sb.reverse(); // dlroW olleH
        System.out.println(sb);
    }
}
