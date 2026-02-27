package GarbageCollection.Eligibility.ObjectCreatedInsideMethod;

public class Demo {
    static void CreateObj(){
        Demo d = new Demo();
        Demo d2 = new Demo();
    }

    public static void main(String[] args) {
        CreateObj();//after one execution of this function objects on stack side are eligible for GC
    }
}
