package ex_09_SwitchCase;

public class Lab077_Interview_Que2 {
    public static void main(String[] args) {
        char ch = 'A';
        switch (ch){
            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");
        }
    }
    //char ch = 'A';
    //'A' has an ASCII value of 65.
    //switch (ch) uses the ASCII value of ch (which is 65) to match cases.
    //case 65: matches because 'A' == 65.
}
