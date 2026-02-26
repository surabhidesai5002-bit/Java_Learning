package OOPS.Abstarction.complete.Interface.Default_methods.HowtoAccess;

public interface Vehicle {
    default void start(){
        System.out.println("Vehicle started");
    }
    default void stop(){
        System.out.println("Vehicle stopped");
    }
    default void carFunction(){
        System.out.println("Vehicle function");
    }
}

class Car implements Vehicle{
    public void carFunction(){
        System.out.println("Car started");
    }
}

class Driver{
    static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.carFunction();
        c.stop();
        Vehicle v = new Car();//upcasting
        v.start();
        v.stop();
        v.carFunction();
    }
}