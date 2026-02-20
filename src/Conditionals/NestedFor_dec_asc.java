package Conditionals;

public class NestedFor_dec_asc {
    public static void main(String[] args) {
        //descending order
        for (int i = 0; i < 5; i++) {
            for (int j = i +1 ; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //ascending order
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
