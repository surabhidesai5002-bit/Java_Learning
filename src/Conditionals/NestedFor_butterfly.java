package Conditionals;

public class NestedFor_butterfly {
    public static void main(String[] args) {
        //upper part
        for(int i = 0; i < 6 ; i++) {
            for (int j = 0 ; j <= i ; j++) {
                System.out.print("*");
            }
            for(int k = 2*i  ; k < 2*5 ; k ++) {
                System.out.print(" ");
            }
            for(int j = 0 ; j <= i ; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part
        for(int i = 4; i >=0 ; i--) {
            for (int j = 0 ; j <= i ; j++) {
                System.out.print("*");
            }
            for(int k = 2*i  ; k < 2*5 ; k ++) {
                System.out.print(" ");
            }
            for(int j = 0 ; j <= i ; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
