package OOPS.Abstarction.Multiple_Inheritence;

public interface Mom {
    //void cook();
    default void cook(){
        System.out.println("Indian");
    }
}

 interface Dad {
    default void cook(){
        System.out.println("Chinese");
    }
}

class child implements Mom,Dad{
    @Override
    public void cook(){
        System.out.println("Italian");
        Mom.super.cook();//this prints Indian
        Dad.super.cook();//this prints Chinese
    }
}

class Driver{
    static void main(String[] args) {
        child c = new child();
        c.cook();
    }
}