package Methods;

public class MethodEx2 {

    static int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("sum of a and b is " + add(10, 20));
        String result = String.format("Sum is %d", add(10,20));
        System.out.println(result);
    }
}
