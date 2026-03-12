package WrapperClasses;

//Primitive ----> Wrapper = Boxing
public class WrapperDemo1 {
    public static void main(String[] args) {
        int x = 10;
        Integer obj = new Integer(x);//Manual boxing

        System.out.println("Primitive value : " + x);
        System.out.println("Wrapper Object : " + obj);
    }
}
