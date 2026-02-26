package OOPS.Abstarction.complete.Interface.demo;

public interface Animal {
    void sound();//abstract method
    void run();//abstract method
}

class Lion implements Animal{
    public void sound(){
        System.out.println("roar");
    }
    public void run(){
        System.out.println("Running..");
    }
}

class driver{
    public static void main(String[] args) {
        Lion l = new Lion();
        l.run();
        l.sound();
    }
}