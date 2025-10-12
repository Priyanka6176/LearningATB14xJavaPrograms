package ex_12_Do_While_Loop;

public class Lab106_Do_While_Loop {
    public static void main(String[] args) {
        int a = 1;
        do{
            System.out.println("Body!");
            System.out.println(a);
            a++;
        }while (a<10);
    }// do-while loops always execute the body at least once, even if the condition is false initially.
}
