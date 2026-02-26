package OOPS.Abstarction.complete.Interface.Default_methods;

public interface Vehicle {
    void start();

    default void stop(){
        System.out.println("Vehicle stopped");
    }
    static void st(){
        System.out.println("Vehicle runs");
    }
}

class Audi implements Vehicle{
    public void start(){
        System.out.println("Audi has started");
    }
    public void stop(){
        System.out.println("Audi stopped");
    }
}

class BMW implements Vehicle{
    public void start(){
        System.out.println("BMW has started");
    }
}

class Rolsroyc implements Vehicle{
    public void start(){
        System.out.println("Rolsroyc has started");
    }
}

class Driver{
    static void main(String[] args) {
        Audi a = new Audi();
        a.start();
        a.stop();
        BMW bmw = new BMW();
        bmw.start();
        bmw.stop();
        Rolsroyc rc = new Rolsroyc();
        rc.start();
        rc.stop();
        Vehicle.st();
    }
}
