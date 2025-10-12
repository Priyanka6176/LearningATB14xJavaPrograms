package ex_09_SwitchCase;

public class Lab082_JDK13 {
    public static void main(String[] args) {
        int itemcode = 006;
        switch (itemcode){
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");
        }
        //Java code using multi-label case statements, which is a great feature introduced in Java 14+
    }
}
