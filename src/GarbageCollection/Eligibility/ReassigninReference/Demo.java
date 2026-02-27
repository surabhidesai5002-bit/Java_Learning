package GarbageCollection.Eligibility.ReassigninReference;

public class Demo {
    static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1 = obj2;//now obj1 eligible for GC
    }
}
