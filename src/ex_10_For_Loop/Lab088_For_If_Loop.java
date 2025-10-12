package ex_10_For_Loop;

public class Lab088_For_If_Loop {
    public static void main(String[] args) {
        for (int shruti = 0; shruti < 18; shruti++) {
            if(shruti > 15){
                System.out.println("Gift from Papa,IPhone 17  Pro Max Ultra YO!");
            }else{
                System.out.println("No Gift");
            }
            // how many gift she got?>> She got 2 gifts.
            //Loop runs from shruti = 0 to shruti = 17 (because shruti < 18)
            //Total iterations: 18 times
            //Gift condition: if (shruti > 15) → gifts are given only when shruti is 16 or 17
        }
    }
}
