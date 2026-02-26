package OOPS.Abstarction.complete.Interface.interfaces100_Abstract;
//why interfaces are 100%abstract
public interface Demo {
    void show();

    default void display(){
        System.out.println("Default method!");
    }

    static void message(){
        System.out.println("Static method!");
    }
}

class demochild implements Demo{
    public void show(){
        System.out.println("demochild");
    }
}
class driver{
    static void main(String[] args) {
        Demo.message();
        demochild dc = new demochild();
        dc.show();
        dc.display();
    }
}