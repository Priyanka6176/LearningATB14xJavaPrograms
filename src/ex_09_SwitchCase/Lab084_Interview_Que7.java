package ex_09_SwitchCase;

public class Lab084_Interview_Que7 {
    public static void main(String[] args) {
        char code = 'C';
        switch (code){
            default:
                System.out.println("Hellooooooo");
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }
        //code = 'C' → ASCII value is 67
        //switch(code) → evaluates to 'C' → does not match 'A' or 'B'
        //So Java falls back to the default block
        //Important behavior in classic switch:
        //If there's no break after default, execution falls through to the next case(s) until a break is encountered.
    }
}
