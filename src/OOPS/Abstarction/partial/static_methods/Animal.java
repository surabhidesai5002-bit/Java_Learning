package OOPS.Abstarction.partial.static_methods;

abstract class Animal {
    static void info(){
        System.out.println("Animal is sitting.....");
    }
    abstract void sound();
}

class Lion extends Animal {
    void sound(){
        System.out.println("roars");
    }
}

class cat extends Animal {
    void sound(){
        System.out.println("Meow");
    }
}
class Driver{
    public static void main(String[] args) {
        Lion l = new Lion();
        Animal.info();
        Lion.info();
        l.sound();
        cat c = new cat();
        cat.info();
        c.sound();
    }
}
