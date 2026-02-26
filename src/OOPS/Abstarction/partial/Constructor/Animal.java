package OOPS.Abstarction.partial.Constructor;

abstract class Animal {
    Animal(){
        System.out.println("Animal Constructor");
    }
    abstract void sound();
}

class Lion extends Animal {
    Lion(){
        System.out.println("Lion constructor");
    }
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
        l.sound();
        cat c = new cat();
        c.sound();
    }
}

