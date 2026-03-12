package WrapperClasses;

public class WrapperDemo2 {
    public static void main(String[] args) {
        int x = 10;

        Integer obj = x;//AutoBoxing(primitive to Wrapper)

        int y = obj;//Unboxing(Wrapper to primitive)

        System.out.println("Primitive value : " + x);
        System.out.println("Wrapper Object : " + obj);
        System.out.println("Converted to Primitive value : " + y);
    }
}
