package ex_14_Strings;

public class Lab121_String_Example1 {
    public static void main(String[] args) {
        String s= "Java";
        char c = s.charAt(2); //"Java".charAt(2) returns the character at index 2 (0-based): 'v'
        System.out.println(c);

        int result = "abc".compareTo("ABC"); //Compares lexicographically using Unicode values.
        //'a' = 97, 'A' = 65 → difference = 32
        System.out.println(result);

        int idx = "Java".indexOf("a"); // Finds the first occurrence of "a" in "Java" → index 1
        System.out.println(idx);

        int idx2 = "Java".lastIndexOf("a"); // Finds the last occurrence of "a" in "Java" → index 3
        System.out.println(idx2);


        boolean b = "".isEmpty(); // Checks if the string is empty → yes, it's "" -> true
        System.out.println(b);

        String s11 = String.join("*", "Java", "Python"); //Joins the strings with * between them: "Java*Python"
        System.out.println(s11);

        String s12 = "Java".replace('a', 'o'); // Replaces all 'a' with 'o' → "Jovo"
        System.out.println(s12);

        boolean b1 = "Java".startsWith("Ja"); //Checks if "Java" starts with "Ja" → yes -> true
        System.out.println(b1);

        String b2 = "Java".concat("Mava"); // Concatenates "Java" + "Mava" → "JavaMava"
        System.out.println(b2);
    }
}
