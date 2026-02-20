package Conditionals;

public class Heart_pattern {
    public static void main(String[] args) {
        int rows = 6, cols = 7;
        for(int r = 0 ; r < rows ; r ++){
            for(int c = 0 ; c < cols ; c++){
                // 1st 2 lines (top curves)
                if(r == 0 && c % 3 != 0) {
                    System.out.print(" * ");
                }
                else if(r == 1 && c % 3 == 0) {
                    System.out.print(" * ");
                }
                // "\" part of heart
                else if(r - c == 2) {
                    System.out.print(" * ");
                }
                // "/" part of heart
                else if(r + c == 8) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}