package OOPS.Constructor_demo;

public class demo {
    demo(){
        System.out.println("I am a constructor.");
    }
}
class drive{
    public static void main() {
        demo o1 = new demo();
        demo o2 = new demo();
    }
}

