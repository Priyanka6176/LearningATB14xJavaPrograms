package ex_09_SwitchCase;

public class Lab083_Interview_Que6 {
    public static void main(String[] args) {
        int a = 11;
        switch (-1){
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("9");
                break;
        }
        //Even though default is listed first, it's not executed, because an exact match (case -1) is found
    }

}
