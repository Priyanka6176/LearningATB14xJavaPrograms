package ex_09_SwitchCase;

public class Lab080_Interview_Que5 {
    public static void main(String[] args) {
        int a = 98;
        switch (a) {
            case 98:
                System.out.println("98");
           //  case 98:
            //   System.out.println("98");
        }

        //Java does not allow duplicate case values in the same switch block,
        // because it would be ambiguous which one to execute.
    }
}
