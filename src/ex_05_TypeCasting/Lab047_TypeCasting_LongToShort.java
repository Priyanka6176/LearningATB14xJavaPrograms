package ex_05_TypeCasting;

public class Lab047_TypeCasting_LongToShort {
    public static void main(String[] args) {
        long phone_no = 9876543210l;
//        short s = phone_no; // Narrowing - implicit >>Invalid
        short s = (short) phone_no; // Narrowing - Explicit>> Valid
        System.out.println(s);
    }
}
