package ex_15_StringBuilder_Buffer_StringFunctions;

public class Lab127_String_Builder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Java");
        stringBuilder.append(123);
        System.out.println(stringBuilder);
    }
}
//StringBuilder is mutable, so the append() method modifies the existing object.
//The number 123 is automatically converted to a string ("123") and appended to "Java"
