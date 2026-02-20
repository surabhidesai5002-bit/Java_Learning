package Methods;

public class Swap {
    static void swap(){
        int a = 10, b = 20;
        System.out.println("Before swap " + "a = " + a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After  swap " + "a = " + a +" b = " + b);
    }

    public static void main() {
        swap();
    }


}
