package OOPS.Inheritance.multi_level;

import OOPS.Inheritance.single_level.Animal;

public class Animals {
    void eat(){
        System.out.println("Eating.....");
    }
}

class Lion extends Animals {
    void roar(){
        System.out.println("Roaring.....");
    }
}

class miniLion extends Lion{
    void roars(){
        System.out.println("roaring.....");
    }
}

class Divee{
    public static void main(String[] args) {
        Animals a = new Animals();
        a.eat();
        Lion l = new Lion();
        l.roar();
        l.eat();
        miniLion ml = new miniLion();
        ml.roars();
        ml.roar();
        ml.eat();
    }
}
