package OOPS.Polymorphism.run_time;

public class Mom {
    void cook(){
        System.out.println("Cooking Indian");
    }
}

class daughter extends Mom{
    void cook(){
        System.out.println("Cooking Chinese");
    }
}
class Driver{
    static void main(String[] args) {
        Mom m = new Mom();
        daughter d = new daughter();
        m.cook();
        d.cook();

    }
}