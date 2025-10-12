package ex_09_SwitchCase;

public class Lab079_Interview_Que4 {
    public static void main(String[] args) {
        long a11 = 30l;
        switch ((int) a11) {
            case 30:
                System.out.println("Value is type casted");
                break;
        }
        //switch(long) →  Not allowed directly.
        //switch((int) longValue) → Allowed, if you're sure the value fits in an int.
    }
}
