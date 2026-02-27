package GarbageCollection.Eligibility.NullifyingReference;

public class Demo {
    static void main(String[] args) {
        Demo d = new Demo();
        d = null;//this obj is eligible for GC
    }
}
