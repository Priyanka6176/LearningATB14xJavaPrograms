package ex_14_Strings;

public class Lab122_String_Example2 {
    public static void main(String[] args) {
        CharSequence s = "JavaClass".subSequence(1,4);
        System.out.println(s);
    }
}
//The method .subSequence(start, end) returns a subsequence (similar to substring) starting at index 1 and ending before index 4.
//In "JavaClass":
//. Index 0 → 'J'
//. Index 1 → 'a'
//. Index 2 → 'v'
//. Index 3 → 'a'
//. Index 4 → 'C'
// So, from index 1 to 3 → "ava"
