package OOPS.Polymorphism.compile_time;

public class Addition {
    int add(int a, int b){
        return a + b;
    }

    double add(double a, double b){
        return a + b;
    }

    float add(float a, int b, float c){
        return a + b + c;
    }
}
class drive{
    static void main(String[] args) {
        Addition a = new Addition();
        System.out.println(a.add(1,2));
        System.out.println(a.add(2,1));
        System.out.println(a.add(3,6,8));
    }
}