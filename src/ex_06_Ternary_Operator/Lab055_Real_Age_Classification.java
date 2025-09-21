package ex_06_Ternary_Operator;

public class Lab055_Real_Age_Classification {
    public static void main(String[] args) {
        int age = 68;
        String result = (age < 18) ? "Minor" : (age <= 60) ? "Adult": "Sr. Citizen";
        System.out.println(result);
    }
}
