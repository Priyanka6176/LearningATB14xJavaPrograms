package ex_14_Strings;

public class Lab118_String_Immutable1 {
    public static void main(String[] args) {
        String s1 = "hello";
        s1  = s1.concat("world");
        System.out.println(s1);
    }
}
