package ex_15_StringBuilder_Buffer_StringFunctions;

public class Lab129_String_Buffer1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);

        sb.replace(0, 4, "C++");
        //sb.replace(0, 4, "C++") replaces the substring from index 0 to 4 (excluding 4), which is "Java", with "C++".
        //Output: "C++ Programming"
        System.out.println(sb);
    }
}
