package RecursionAndBackTracking;

public class recDemo {
    static void function(){
        System.out.println("Hello");
        function();
    }
    public static void main(String[] args) {
        function();
    }
}
