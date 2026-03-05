package Threads.LambdaExpression.withOutLambda;

interface Calculator{
    int add(int a, int b);
}

public class Ex2 {
    public static void main(String[] args) {
        //anonymous function with parameters
        Calculator c = new Calculator() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(c.add(11,22));
    }
}
