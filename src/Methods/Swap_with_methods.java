package Methods;

public class Swap_with_methods {
    static int[] swap(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        return new int[]{a,b};
    }

    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swap " + "a = " + a + " b = " + b);
        System.out.printf("Before swap a = %d and b = %d", a,b);
        System.out.println();
        int[] result = swap(10, 20);
        System.out.println("After  swap " + "a = " + result[0] +" b = " + result[1]);
    }
}
