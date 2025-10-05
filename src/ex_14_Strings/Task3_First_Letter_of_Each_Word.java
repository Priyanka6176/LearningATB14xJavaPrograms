package ex_14_Strings;



public class Task3_First_Letter_of_Each_Word {
    public static void main(String[] args) {
        String str="Here is your string to validate the First letter of each words";

String [] split= str.split(" ");

        for (int i = 0; i < split.length; i++) {
            System.out.println("first letter of each word is:"+ split[i].charAt(0));
    }}}

