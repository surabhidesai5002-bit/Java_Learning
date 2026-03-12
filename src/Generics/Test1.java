package Generics;


class Test1<T> { //Custom generic class with custom data type T
    T obj;
    Test1(T obj){
        this.obj = obj;
    }
}

class Driver{
    public static void main(String[] args) {
        Test1<Integer> obj1 = new Test1<>(2);
        Test1<String> obj2 = new Test1<>("Hello");
    }
}
