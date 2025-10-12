package ex_14_Strings;

public class Lab123_String_Example3 {
    public static void main(String[] args) {
        String s = "Java".substring(2);
        System.out.println(s); //"Java" → index 2 is 'v'
        //Returns substring from index 2 to end → "va"

        String s1 = "Java".substring(1, 3);
        System.out.println(s1);
       // "Java" → substring from index 1 to 3 (exclusive): 'a', 'v' → "av"

        char[] arr = "Java".toCharArray();
        System.out.println(arr); // ['J', 'a', 'v', 'a']
       // Converts string to char array: ['J', 'a', 'v', 'a']
        // When you print a char[], Java prints the characters as a string (not with commas or brackets).

        String st = " Java ".trim(); // Removes leading and trailing spaces, so " Java " → "Java"
        System.out.println(st);

        boolean b = "   ".isBlank();
        System.out.println(b);
        // Checks if string is empty or contains only whitespace
        // " " → only spaces → true

        String s2 = "ab".repeat(3);
        System.out.println(s2);
        // Repeats "ab" three times → "ab" + "ab" + "ab" = "ababab"

        boolean b11 = "Java".equalsIgnoreCase("java");
        System.out.println(b11);
        //Compares two strings ignoring case
        //"Java" and "java" → equal ignoring case → true

        long count = "a\nb\nc".lines().count();
        System.out.println(count);
        //Splits the string into lines (by newline \n)
        //"a\nb\nc" → lines: "a", "b", "c" → 3 lines
    }
}
