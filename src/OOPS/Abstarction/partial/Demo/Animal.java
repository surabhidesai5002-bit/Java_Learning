package OOPS.Abstarction.partial.Demo;

abstract class Animal {
    abstract void sound();

    void run(){
        System.out.println("Running");
    }
}

class Lion extends Animal{
    void sound(){
        System.out.println("roars");
    }
}

class cat extends Animal{
    void sound(){
        System.out.println("Meow");
    }
}
class Driver{
     public static void main(String[] args) {
        Lion l = new Lion();
        l.sound();
        l.run();
        cat c = new cat();
        c.sound();
        c.run();
    }
}
