package ex_15_StringBuilder_Buffer_StringFunctions;

public class Lab126_String_Buffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Java");

        stringBuffer.append("Learning");
        System.out.println(stringBuffer); // JavaLearning
       //StringBuffer is mutable, so append("Learning") modifies the existing object.
        //No new object is created.
        //Memory-efficient for repeated changes (like in loops).

        String s1 = "JAva";
        s1 = s1+ "Learning";
        System.out.println(s1); //JAvaLearning
        //String is immutable, so s1 + "Learning" creates a new String object.
        //s1 is now pointing to this new object ("JAvaLearning"), and the original "JAva" is discarded (garbage-collected if no other references).
    }
}
