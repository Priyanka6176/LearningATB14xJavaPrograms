package ex_16_Arrays;

public class Lab133_Arrays {
    public static void main(String[] args) {
        int a = 10;
        int marks[] = {91, 90, 51, 100, 91, 92, 89};

        boolean [] is_married_people = {true,true,false};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[4]);

//        System.out.println(marks[-1]); // java.lang.ArrayIndexOutOfBoundsException
// Negative indexing is not allowed in Java arrays.

        String name = "Java";
        String[] name_each_element_char = name.split("");
        //   ["J","a","v","a"]//This uses regex-based .split("") to split the string into an array of individual characters.

        for (String s: name_each_element_char){
            System.out.println(s);
        }

    }
}
