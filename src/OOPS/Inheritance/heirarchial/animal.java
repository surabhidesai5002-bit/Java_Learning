package OOPS.Inheritance.heirarchial;

import OOPS.Inheritance.multi_level.Animals;

public class animal {
    void eat(){
        System.out.println("Eating.....");
    }
}

class Lion extends animal{
    void roar(){
        System.out.println("Roaring.....");
    }
}

class Cat extends animal {
    void meow(){
        System.out.println("meowing.....");
    }
}

class Divee{
    public static void main(String[] args) {
        animal a = new animal();
        a.eat();
        Lion l = new Lion();
        l.roar();
        l.eat();
        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}
