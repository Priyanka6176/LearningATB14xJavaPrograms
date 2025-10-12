package ex_15_StringBuilder_Buffer_StringFunctions;

public class Lab125_StringBuilder_Vs_Buffer {
    public static void main(String[] args) {
        // String - 90%
        String s0 = "Java";
        String s1 = new String("Java");

        // less than <10% used.
        StringBuffer stringBuffer = new StringBuffer("Java");
        StringBuilder stringBuilder = new StringBuilder("Java");


        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
    }
}
//StringBuffer → Thread-safe (synchronized) → slower.
//StringBuilder → Not thread-safe, but faster in single-threaded applications.