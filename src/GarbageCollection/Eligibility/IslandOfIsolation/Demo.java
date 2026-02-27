package GarbageCollection.Eligibility.IslandOfIsolation;

public class Demo {
    Demo ref;
}

class Driver{
    static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1.ref = obj2;
        obj2.ref = obj1;
        //now both are pointing to each other

        obj1 = null;
        obj2 = null;
        //both objects on stack side are eligible for GC
    }
}
