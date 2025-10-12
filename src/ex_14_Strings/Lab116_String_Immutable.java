package ex_14_Strings;

public class Lab116_String_Immutable {
    public static void main(String[] args) {
        String name =  "Priyanka";
        name.toUpperCase(); // PRIYANKA
        System.out.println(name); // PRIYANKA
        //Strings in Java are immutable, which means methods like toUpperCase()
        // don’t change the original string—they return a new string with the changes. so in String Constant Pool it will
        // create 2 string
    }
}
