package ex_08_If_Condition;

public class Lab072_If_ElseIf_Else {
    public static void main(String[] args) {

        int age = 34;
        if(age > 34){ //false>> so this block nec=ver get execute
            System.out.println("AGE > 34");
        }else if( age < 34){ //false>> so this block nec=ver get execute
            System.out.println("AGE  < 34");
        }else{
            System.out.println("AGE"); // Above conditions are false so it will get execute
        }

    }
}
